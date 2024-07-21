package base;

import pages.PageObjectManager;

public class PicoTestContext {

	private Browserfactory browserFactory;
	private PageObjectManager pageObjectManager;
	
	public PicoTestContext() {
		browserFactory = new Browserfactory();
		pageObjectManager = new PageObjectManager(browserFactory.browserInstantiate());
	}

	public Browserfactory getBrowserFactory() {
		return browserFactory;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
}
