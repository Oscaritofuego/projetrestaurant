import javax.swing.*;

public class Fenetre extends JFrame {
    private JPanel panel;
    private JTextField entreeNomField;
    private JTextField entreeQuantiteField;
    private JTextField platNomField;
    private JTextField platQuantiteField;
    private JTextField dessertNomField;
    private JTextField dessertQuantiteField;
    private JButton validerButton;
    private JButton annulerButton;

    public Fenetre() {
        // Créer une fenêtre
        setTitle("Menu du restaurant");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Créer un panneau principal
        panel = new JPanel();
        add(panel);

        // Créer des champs de saisie pour les entrées, les plats et les desserts
        entreeNomField = new JTextField("Nom de l'entrée");
        entreeQuantiteField = new JTextField("Quantité de l'entrée");
        platNomField = new JTextField("Nom du plat");
        platQuantiteField = new JTextField("Quantité du plat");
        dessertNomField = new JTextField("Nom du dessert");
        dessertQuantiteField = new JTextField("Quantité du dessert");

        // Créer des boutons "Valider" et "Annuler"
        validerButton = new JButton("Valider");
        annulerButton = new JButton("Annuler");

        // Ajouter les champs de saisie et les boutons au panneau
        panel.add(entreeNomField);
        panel.add(entreeQuantiteField);
        panel.add(platNomField);
        panel.add(platQuantiteField);
        panel.add(dessertNomField);
        panel.add(dessertQuantiteField);
        panel.add(validerButton);
        panel.add(annulerButton);

        // Afficher la fenêtre
        setVisible(true);
    }
}