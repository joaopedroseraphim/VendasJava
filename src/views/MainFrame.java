package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	
	
	//Produtos
	private JPanel contentPane;
	private JTextField txtBusca;
	private JTextField txtNome;
	private JTextField txtPreco;
	private JTextField txtCategoria;
	private JTextArea txtDescricao;
	private JButton btnAlterar;
	private JButton btnAdicionar;
	private JButton btnDeletar;
	private JButton btnLimpar;
	private JButton btnBuscar;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("Sistema de vendas");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel tabProdutos = new JPanel();
		tabbedPane.addTab("Produtos", null, tabProdutos, null);
		tabProdutos.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar produtos por ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(396, 10, 365, 20);
		tabProdutos.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(384, 10, 2, 406);
		tabProdutos.add(separator);
		
		txtBusca = new JTextField();
		txtBusca.setBounds(396, 40, 271, 22);
		tabProdutos.add(txtBusca);
		txtBusca.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(677, 39, 84, 22);
		tabProdutos.add(btnBuscar);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(384, 72, 377, 50);
		tabProdutos.add(separator_1);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNome.setBounds(10, 46, 351, 20);
		tabProdutos.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(10, 78, 351, 22);
		tabProdutos.add(txtNome);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(10, 144, 351, 22);
		tabProdutos.add(txtPreco);
		
		JLabel lblPreo = new JLabel("Preço:");
		lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreo.setBounds(10, 112, 351, 20);
		tabProdutos.add(lblPreo);
		
		txtCategoria = new JTextField();
		txtCategoria.setColumns(10);
		txtCategoria.setBounds(10, 210, 351, 22);
		tabProdutos.add(txtCategoria);
		
		JLabel lblEmpresa = new JLabel("Categoria:");
		lblEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmpresa.setBounds(10, 178, 351, 20);
		tabProdutos.add(lblEmpresa);
		
		JScrollPane scpnProdutos = new JScrollPane();
		scpnProdutos.setBounds(396, 89, 365, 327);
		tabProdutos.add(scpnProdutos);
		
		JLabel lblDescrio = new JLabel("Descrição:");
		lblDescrio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDescrio.setBounds(10, 244, 351, 20);
		tabProdutos.add(lblDescrio);
		
		txtDescricao = new JTextArea();
		txtDescricao.setBounds(10, 276, 351, 90);
		tabProdutos.add(txtDescricao);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(10, 376, 100, 35);
		tabProdutos.add(btnAdicionar);
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(134, 376, 100, 35);
		tabProdutos.add(btnAlterar);
		
		btnDeletar = new JButton("Deletar");
		btnDeletar.setBounds(261, 376, 100, 35);
		tabProdutos.add(btnDeletar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(10, 10, 84, 25);
		tabProdutos.add(btnLimpar);
		
		JPanel tabClientes = new JPanel();
		tabbedPane.addTab("Clientes", null, tabClientes, null);
		tabClientes.setLayout(null);
		
		JScrollPane scpnProdutos_1 = new JScrollPane();
		scpnProdutos_1.setBounds(396, 89, 365, 327);
		tabClientes.add(scpnProdutos_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(384, 10, 2, 406);
		tabClientes.add(separator_2);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(384, 72, 377, 50);
		tabClientes.add(separator_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(396, 40, 271, 22);
		tabClientes.add(textField);
		
		JLabel lblBuscarClientesPor = new JLabel("Buscar clientes por ID:");
		lblBuscarClientesPor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBuscarClientesPor.setBounds(396, 10, 365, 20);
		tabClientes.add(lblBuscarClientesPor);
		
		JButton btnBuscar_1 = new JButton("Buscar");
		btnBuscar_1.setBounds(677, 39, 84, 22);
		tabClientes.add(btnBuscar_1);
		
		JButton btnAdicionar_1 = new JButton("Adicionar");
		btnAdicionar_1.setBounds(10, 376, 100, 35);
		tabClientes.add(btnAdicionar_1);
		
		JButton btnAlterar_1 = new JButton("Alterar");
		btnAlterar_1.setBounds(134, 376, 100, 35);
		tabClientes.add(btnAlterar_1);
		
		JButton btnDeletar_1 = new JButton("Deletar");
		btnDeletar_1.setBounds(261, 376, 100, 35);
		tabClientes.add(btnDeletar_1);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(10, 247, 351, 20);
		tabClientes.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 213, 351, 22);
		tabClientes.add(textField_1);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelefone.setBounds(10, 181, 351, 20);
		tabClientes.add(lblTelefone);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 147, 351, 22);
		tabClientes.add(textField_2);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCpf.setBounds(10, 115, 351, 20);
		tabClientes.add(lblCpf);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 81, 351, 22);
		tabClientes.add(textField_3);
		
		JLabel lblNome_1 = new JLabel("Nome:");
		lblNome_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNome_1.setBounds(10, 49, 351, 20);
		tabClientes.add(lblNome_1);
		
		JButton btnLimpar_1 = new JButton("Limpar");
		btnLimpar_1.setBounds(10, 12, 84, 25);
		tabClientes.add(btnLimpar_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 279, 351, 22);
		tabClientes.add(textField_4);
		
		JLabel lblEndereo = new JLabel("Endereço:");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEndereo.setBounds(10, 313, 351, 20);
		tabClientes.add(lblEndereo);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 345, 351, 22);
		tabClientes.add(textField_5);
		
		JPanel tabEstoque = new JPanel();
		tabbedPane.addTab("Estoque", null, tabEstoque, null);
		tabEstoque.setLayout(null);
		
		JPanel tabVendas = new JPanel();
		tabbedPane.addTab("Vendas", null, tabVendas, null);
		tabVendas.setLayout(null);

	}
	
	
}
