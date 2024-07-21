package steps;

public class AmazonSearchSteps {

	private AmazonHomePage amazonHomePage;
	
	public AmazonSearchSteps(PicoTestContext picoTestContext) {
		amazonHomePage = picoTestContext.getPageObjectManager().getAmazonPageObject();
	}
}
