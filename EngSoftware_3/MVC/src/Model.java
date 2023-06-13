import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Model implements Subject {
	private static Model instance;
	private ArrayList<Observer> observers;
	private String nome;
	private String cpf;
	private String produto;

	private Model() {
		observers = new ArrayList<>();
	}

	public static synchronized Model getInstance() {
		if (instance == null) {
			instance = new Model();
		}
		return instance;
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(nome, cpf, produto);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(String nome, String cpf, String produto) {
		this.nome = nome;
		this.cpf = cpf;
		this.produto = produto;
		measurementsChanged();
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getProduto() {
		return produto;
	}

	// Método de fachada para simplificar a interação com a classe Model
	public static void scheduleMeasurements(final String nome, final String cpf, final String produto, long delay) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				Model model = Model.getInstance();
				model.setMeasurements(nome, cpf, produto);
			}
		}, delay);
	}

}
