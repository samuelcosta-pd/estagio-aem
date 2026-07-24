// Simple JS for Destaque Component
document.addEventListener('DOMContentLoaded', () => {
    const destaques = document.querySelectorAll('.cmp-destaque');
    
    destaques.forEach(destaque => {
        const button = destaque.querySelector('.cmp-destaque__button');
        
        if (button) {
            button.addEventListener('click', (e) => {
                // Exemplo de um comportamento simples de JS: log de tracking de clique
                console.log('Destaque button clicked: ', button.getAttribute('href'));
            });
        }
    });
});
