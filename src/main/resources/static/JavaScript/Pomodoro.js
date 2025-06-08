
  let tiempoRestante = 1500; // 25 minutos
  let temporizadorIntervalo = null;
  let modoActual = 'pomodoro';
  let duraciones = {
    'pomodoro': 25 * 60,
    'descanso-corto': 5 * 60,
    'descanso-largo': 15 * 60
  };

  function actualizarTemporizador() {
    const minutos = Math.floor(tiempoRestante / 60).toString().padStart(2, '0');
    const segundos = (tiempoRestante % 60).toString().padStart(2, '0');
    document.getElementById('temporizador').textContent = `${minutos}:${segundos}`;
  }

  function setModo(modo) {
    modoActual = modo;
    tiempoRestante = duraciones[modo];
    detenerTemporizador();
    actualizarTemporizador();

    // Cambiar colores si deseas según modo (opcional)
    document.querySelectorAll(".modos-pomodoro button").forEach(btn => btn.classList.remove("activo"));
    event.target.classList.add("activo");
  }

  function iniciarPomodoro() {
    if (!temporizadorIntervalo) {
      temporizadorIntervalo = setInterval(() => {
        if (tiempoRestante > 0) {
          tiempoRestante--;
          actualizarTemporizador();
        } else {
          clearInterval(temporizadorIntervalo);
          temporizadorIntervalo = null;
          alert('¡Tiempo terminado!');
        }
      }, 1000);
    }
  }

  function pausarPomodoro() {
    detenerTemporizador();
  }

  function reiniciarPomodoro() {
    tiempoRestante = duraciones[modoActual];
    detenerTemporizador();
    actualizarTemporizador();
  }

  function detenerTemporizador() {
    if (temporizadorIntervalo) {
      clearInterval(temporizadorIntervalo);
      temporizadorIntervalo = null;
    }
  }

  // Inicializar al cargar
  actualizarTemporizador();

