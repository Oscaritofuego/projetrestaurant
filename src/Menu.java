import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu extends JFrame {
	public static void main(String[] args) {
	    EventQueue.invokeLater(() -> {
	        Menu menu = new Menu();
	        menu.setVisible(true);
	        menu.setSize(400, 300);
	    });
	}
	

    private List<Entree> entrees = new ArrayList<>();
    private List<Plat> plats = new ArrayList<>();
    private List<Dessert> desserts = new ArrayList<>();

    private JTextField entreeTextField;
    private JTextField entreeQuantiteTextField;
    private JTextField platTextField;
    private JTextField platQuantiteTextField;
    private JTextField dessertTextField;
    private JTextField dessertQuantiteTextField;

    public Menu() {
        initUI();
    }

    public void ajouterEntree(Entree entree) {
        entrees.add(entree);
    }

    public void ajouterPlat(Plat plat) {
        plats.add(plat);
    }

    public void ajouterDessert(Dessert dessert) {
        desserts.add(dessert);
    }

    public List<Entree> getEntrees() {
        return entrees;
    }

    public List<Plat> getPlats() {
        return plats;
    }

    public List<Dessert> getDesserts() {
        return desserts;
    }

    private void initUI() {
        setTitle("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel entreeLabel = new JLabel("Entrée : ");
        entreeTextField = new JTextField(10);
        JLabel entreeQuantiteLabel = new JLabel("Quantité : ");
        entreeQuantiteTextField = new JTextField(5);
        JButton ajouterEntreeButton = new JButton("Ajouter une entrée");
        ajouterEntreeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nom = entreeTextField.getText();
                int quantite = Integer.parseInt(entreeQuantiteTextField.getText());
                ajouterEntree(new Entree(nom, quantite));
                entreeTextField.setText("");
                entreeQuantiteTextField.setText("");
            }
        });
        JPanel ajouterEntreePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ajouterEntreePanel.add(entreeLabel);
        ajouterEntreePanel.add(entreeTextField);
        ajouterEntreePanel.add(entreeQuantiteLabel);
        ajouterEntreePanel.add(entreeQuantiteTextField);
        ajouterEntreePanel.add(ajouterEntreeButton);
        panel.add(entreeLabel);
        panel.add(entreeTextField);
        panel.add(entreeQuantiteLabel);
        panel.add(entreeQuantiteTextField);
        panel.add(ajouterEntreeButton);

        JLabel platLabel = new JLabel("Plat : ");
        platTextField = new JTextField(10);
        JLabel platQuantiteLabel = new JLabel("Quantité : ");
        platQuantiteTextField = new JTextField(5);
        JButton ajouterPlatButton = new JButton("Ajouter un plat");
        ajouterPlatButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nom = platTextField.getText();
                int quantite = Integer.parseInt(platQuantiteTextField.getText());
                ajouterPlat(new Plat(nom, quantite));
                platTextField.setText("");
                platQuantiteTextField.setText("");
            }
        });
        JPanel ajouterPlatPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ajouterPlatPanel.add(platLabel);
        ajouterPlatPanel.add(platTextField);
        ajouterPlatPanel.add(platQuantiteLabel);
        ajouterPlatPanel.add(platQuantiteTextField);
        ajouterPlatPanel.add(ajouterPlatButton);
        panel.add(platLabel);
        panel.add(platTextField);
        panel.add(platQuantiteLabel);
        panel.add(platQuantiteTextField);
        panel.add(ajouterPlatButton);

        // Ajout d'un dessert
        JLabel dessertLabel = new JLabel("Nom : ");
        dessertTextField = new JTextField(10);
        JLabel dessertQuantiteLabel = new JLabel("Quantité : ");
        dessertQuantiteTextField = new JTextField(5);
        JButton ajouterDessertButton = new JButton("Ajouter un dessert");
        ajouterDessertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nom = dessertTextField.getText();
                int quantite = Integer.parseInt(dessertQuantiteTextField.getText());
                ajouterDessert(new Dessert(nom, quantite));
                dessertTextField.setText("");
                dessertQuantiteTextField.setText("");
            }
        });
        JPanel ajouterDessertPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ajouterDessertPanel.add(dessertLabel);
        ajouterDessertPanel.add(dessertTextField);
        ajouterDessertPanel.add(dessertQuantiteLabel);
        ajouterDessertPanel.add(dessertQuantiteTextField);
        ajouterDessertPanel.add(ajouterDessertButton);
        panel.add(dessertLabel);
        panel.add(dessertTextField);
        panel.add(dessertQuantiteLabel);
        panel.add(dessertQuantiteTextField);
        panel.add(ajouterDessertButton);

        // Ajout du panneau au cadre
        add(panel);
        panel.add(ajouterEntreePanel);
        panel.add(ajouterPlatPanel);
        panel.add(ajouterDessertPanel);
        
        JLabel entreesListLabel = new JLabel("Entrées : " + entrees.toString());
        JLabel platsListLabel = new JLabel("Plats : " + plats.toString());
        JLabel dessertsListLabel = new JLabel("Desserts : " + desserts.toString());
        panel.add(entreesListLabel);
        panel.add(platsListLabel);
        panel.add(dessertsListLabel);

        add(panel);
        pack();
        setLocationRelativeTo(null);
    }
    
    }
    