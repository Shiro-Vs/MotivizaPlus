const botonesAcceder = document.querySelectorAll(".boton-ir");
const modal = document.getElementById("modal-tarea");
const cerrarModal = document.getElementById("cerrar-modal");

// Elementos del contenido del modal
const tituloModal = modal.querySelector(".titulo-modal");
const descripcionModal = modal.querySelector(".descripcion-modal");
const fechaModal = modal.querySelector(".fecha-modal");
const puntosModal = modal.querySelector(".puntos-modal");

botonesAcceder.forEach(boton => {
  boton.addEventListener("click", function () {
    const tarjeta = this.closest(".card-tarea");

    // Extraer los datos desde la tarjeta
    const titulo = tarjeta.querySelector(".titulo-tarea").textContent;
    const descripcion = tarjeta.querySelector(".descripcion-tarea").textContent;
    const fecha = tarjeta.querySelector(".fecha-vencimiento").textContent;
    const puntos = tarjeta.querySelector(".puntos-tarea").textContent;

    // Colocar los datos en el modal
    tituloModal.innerHTML = `<i class="bi bi-journal-text"></i> ${titulo}`;
    descripcionModal.textContent = descripcion;
    fechaModal.innerHTML = `<i class="bi bi-calendar-event"></i> ${fecha}`;
    puntosModal.innerHTML = `<i class="bi bi-star-fill"></i> Recompensa: ${puntos}`;

    // Mostrar el modal
    modal.style.display = "flex";
  });
});

// Cerrar modal al hacer clic en la X
cerrarModal.addEventListener("click", () => {
  modal.style.display = "none";
});

// Cerrar modal al hacer clic fuera del contenido
window.addEventListener("click", function (e) {
  if (e.target === modal) {
    modal.style.display = "none";
  }
});
