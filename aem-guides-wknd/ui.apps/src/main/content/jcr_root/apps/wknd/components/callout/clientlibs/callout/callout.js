(function () {
    "use strict";

    // Encapsulamento para evitar poluição do escopo global
    function initCallout() {
        var buttons = document.querySelectorAll('.cmp-callout__button');
        
        buttons.forEach(function (button) {
            // Evita binding múltiplo caso o script seja reexecutado (ex: autorando)
            if (!button.hasAttribute('data-callout-initialized')) {
                button.addEventListener('click', function () {
                    if (window.console) {
                        console.log('Callout button clicked');
                    }
                });
                button.setAttribute('data-callout-initialized', 'true');
            }
        });
    }

    // Inicializa o componente de forma segura aguardando o DOM
    if (document.readyState !== 'loading') {
        initCallout();
    } else {
        document.addEventListener('DOMContentLoaded', initCallout);
    }

})();
