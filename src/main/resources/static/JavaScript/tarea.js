// Selecciona todos los botones acceder
const botonesAcceder = document.querySelectorAll(".boton-ir");

// Variables modal
const modal = document.getElementById("modal-tarea");
const tituloModal = modal.querySelector(".titulo-modal");
const descripcionModal = modal.querySelector(".descripcion-modal");
const fechaModal = modal.querySelector(".fecha-modal");
const puntosModal = modal.querySelector(".puntos-modal");
const cerrarModal = modal.querySelector(".cerrar");

// Listener para cerrar modal
cerrarModal.addEventListener("click", () => {
  modal.style.display = "none";
});

botonesAcceder.forEach(boton => {
  boton.addEventListener("click", function () {
    if (this.disabled) {
      return;
    }

    const tarjeta = this.closest(".card-tarea");
    if (!tarjeta) return;

    const titulo = tarjeta.querySelector(".titulo-tarea")?.textContent || "Sin título";
    const descripcion = tarjeta.querySelector(".descripcion-tarea")?.textContent || "Sin descripción";
    const fecha = tarjeta.querySelector(".fecha-vencimiento")?.textContent || "Sin fecha";
    const puntos = tarjeta.querySelector(".puntos-tarea")?.textContent || "0 pts";

    tituloModal.innerHTML = `<i class="bi bi-journal-text"></i> ${titulo}`;
    descripcionModal.textContent = descripcion;
    fechaModal.innerHTML = `<i class="bi bi-calendar-event"></i> ${fecha}`;
    puntosModal.innerHTML = `<i class="bi bi-star-fill"></i> Recompensa: ${puntos}`;

    modal.style.display = "flex";
  });
});
