
  // Obtener todos los botones "Canjear"
  const botonesCanjear = document.querySelectorAll(".card .btn-primary");
  const modal = document.getElementById("modal-premio");
  const modalTitulo = document.getElementById("modal-titulo");
  const modalMensaje = document.getElementById("modal-mensaje");

  botonesCanjear.forEach(boton => {
    boton.addEventListener("click", function (e) {
      e.preventDefault();
      const card = this.closest(".card");
      const titulo = card.querySelector(".card-title").textContent;
      const costo = card.querySelector(".card-text").textContent;
      modalMensaje.innerHTML = `¿Quieres reclamar <strong>${titulo}</strong> por <strong>${costo.replace('Costo: ', '')}</strong>?`;
      modal.style.display = "flex";
    });
  });

  // Cerrar modal al hacer clic fuera del contenido
  window.addEventListener("click", function (e) {
    if (e.target === modal) {
      modal.style.display = "none";
    }
  });

  // Cerrar con botones
  document.querySelectorAll(".cerrar-modal").forEach(el => {
    el.addEventListener("click", () => {
      modal.style.display = "none";
    });
  });
