package entities;

public class TaxPayer {
	
	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;
	
	//Constructors
	public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
		super();
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}
   
	//Getters and Setters
	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(Double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public Double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public Double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	//Methods
	public Double salaryTax() {
		if (salaryIncome / 12 < 3000) {
			return 0.0;
		} else if (salaryIncome / 12 < 5000) {
			return salaryIncome * 10 / 100;
		} else {
			return salaryIncome * 20 / 100;
		}
	}
	
	public Double servicesTax() {
		return servicesIncome * 15 / 100;
	}
	
	public Double capitalTax() {
		return capitalIncome * 20 / 100;
	}
	
	public Double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}
	
	public Double taxRebate() {
		if (healthSpending + educationSpending < grossTax() * 30 /100) {
			return healthSpending + educationSpending;
		} else {
			return grossTax() * 30 / 100;
		}
	}
	
	public Double netTax() {
		return grossTax() - taxRebate();
	}
	
}
