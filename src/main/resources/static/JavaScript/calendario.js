 let fechaInicioSeleccionada, fechaFinSeleccionada, eventoSeleccionado;
        let colorSeleccionado = 'color-evento-1'; // Color por defecto
    
        $(document).ready(function () {
            $('#calendar').fullCalendar({
                header: {
                    left: 'title',
                    center: 'month,agendaWeek,agendaDay',
                    right: 'prev,next today'
                },
                editable: true,
                selectable: true,
                defaultView: 'month',
                allDaySlot: false,
                selectHelper: true,
                timeFormat: 'H:mm',
    
                select: function (start, end) {
                    fechaInicioSeleccionada = start;
                    fechaFinSeleccionada = end;
                    eventoSeleccionado = null;
                    $('#tareaTitulo').val('');
                    $('#tareaHora').val('');
                    $('#eventoId').val('');
                    $('#marcarCompletado').hide();
    
                    colorSeleccionado = 'color-evento-1';
                    $('#selectorColores .btn').removeClass('selected');
                    $('#selectorColores .btn[data-color="' + colorSeleccionado + '"]').addClass('selected');
    
                    const modal = new bootstrap.Modal(document.getElementById('tareaModal'));
                    modal.show();
                },
    
                eventClick: function (event) {
                    eventoSeleccionado = event;
                    $('#tareaTitulo').val(event.title.replace(' ✅', '').trim());
                    $('#eventoId').val(event.id || ''); // ID actualizado correctamente
                    $('#marcarCompletado').show();
    
                    const hora = moment(event.start).format("HH:mm");
                    $('#tareaHora').val(hora);
    
                    $('#selectorColores .btn').removeClass('selected');
                    let claseActual = (event.className || []).find(c => c.startsWith('color-evento-')) || 'color-evento-1';
                    colorSeleccionado = claseActual;
                    $('#selectorColores .btn[data-color="' + claseActual + '"]').addClass('selected');
    
                    const modal = new bootstrap.Modal(document.getElementById('tareaModal'));
                    modal.show();
                },
    
                eventRender: function (event, element) {
                    let contenido = '<div>' + event.title + '</div>';
                    if (event.completed) {
                        contenido += '<div class="completado-texto">Completo</div>';
                    }
                    element.find('.fc-content').html(contenido);
                },
    
                events: []
            });
    
            $('#selectorColores .btn').on('click', function () {
                $('#selectorColores .btn').removeClass('selected');
                $(this).addClass('selected');
                colorSeleccionado = $(this).data('color');
            });
    
            $('#guardarTarea').on('click', function () {
    const titulo = $('#tareaTitulo').val().trim();
    const descripcion = $('#descripcion').val().trim();
    const horaInicio = $('#horaInicio').val();
    const horaFin = $('#horaFin').val();

    if (!titulo || !horaInicio || !horaFin) return;

    const fecha = moment(fechaInicioSeleccionada).format("YYYY-MM-DD");
    const start = moment(`${fecha}T${horaInicio}`);
    const end = moment(`${fecha}T${horaFin}`);

    if (eventoSeleccionado) {
        eventoSeleccionado.title = titulo;
        eventoSeleccionado.start = start;
        eventoSeleccionado.end = end;
        eventoSeleccionado.completed = eventoSeleccionado.completed || false;
        eventoSeleccionado.className = [colorSeleccionado];
        if (!eventoSeleccionado.completed) {
            eventoSeleccionado.className.push('evento-pendiente');
        }

        $('#calendar').fullCalendar('updateEvent', eventoSeleccionado);
    } else {
        $('#calendar').fullCalendar('renderEvent', {
    id: Date.now(),
    title: titulo,
    start: start.toDate(),
    end: end.toDate(),
    allDay: false,
    className: [colorSeleccionado, 'evento-pendiente'],
    completed: false,
    description: descripcion
}, true);

    }

    $('#tareaModal').modal('hide');
    $('#calendar').fullCalendar('unselect');
});

    
            $('#marcarCompletado').on('click', function () {
                if (eventoSeleccionado) {
                    eventoSeleccionado.completed = true;
    
                    // Mantener el color original, eliminar evento-pendiente y añadir evento-completado
                    const clases = eventoSeleccionado.className.filter(c => !['evento-pendiente', 'evento-completado'].includes(c));
                    clases.push('evento-completado');
                    eventoSeleccionado.className = clases;
    
                    $('#calendar').fullCalendar('updateEvent', eventoSeleccionado);
                    bootstrap.Modal.getInstance(document.getElementById('tareaModal')).hide();
                }
            });
        });