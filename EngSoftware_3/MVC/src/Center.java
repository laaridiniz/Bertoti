public class Center {
	public static void main(String[] args) {
		final Model model = Model.getInstance();
		ControllerTrial controller = new ControllerTrial(model);

		// Agendar as medições usando o método scheduleMeasurements da classe Model
		Model.scheduleMeasurements("Larissa Silva", "123654789", "Shampoo", 5000);
		Model.scheduleMeasurements("Jeniffer Cristina", "563241789", "Escova", 15000);
	}
}
