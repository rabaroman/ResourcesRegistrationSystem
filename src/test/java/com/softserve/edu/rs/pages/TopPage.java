package com.softserve.edu.rs.pages;

import com.softserve.edu.atqc.controls.ILabelClickable;
import com.softserve.edu.atqc.controls.ISelect;
import com.softserve.edu.atqc.controls.Select;
import com.softserve.edu.atqc.data.apps.PageObserveLoad;


public abstract class TopPage {

	public static enum ChangeLanguageFields {
        UKRAINIAN("українська"),
        RUSSIAN("русский"),
        ENGLISH("english");
        //
        private String field;

        private ChangeLanguageFields(String field) {
            this.field = field;
        }

        @Override
        public String toString() {
            return this.field;
        }
    }
	
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

	private class TopPageUIMap {
    	//public final Select changeLanguage;
    	// TODO Develop select component
    	public ISelect changeLanguage;
    	
    	public TopPageUIMap() {
    		this.changeLanguage = Select.get().getById("changeLanguage"); 
    		//new Select(driver.findElement(By.id("changeLanguage")));
    	}
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	
    // Elements
    private TopPageUIMap controls;

    public TopPage() {
		// TODO Add Observe
		PageObserveLoad.get().deleteLoadCompleteEvents();
		this.controls = new TopPageUIMap();
	}

    // PageObject - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

	// Get Elements

	public ISelect getChangeLanguage() {
		return this.controls.changeLanguage;
	}

	public ILabelClickable getChangeLanguageSelected() {
		return getChangeLanguage().getFirstSelectedOption();
	}

	public String getChangeLanguageSelectedText() {
		return getChangeLanguageSelected().getText();
	}

	// Set Data

	public void setChangeLanguage(ChangeLanguageFields language) {
		getChangeLanguage().selectByVisibleText(language.toString());
	}

	public void setChangeLanguageByPartialText(String partialText) {
		getChangeLanguage().selectByPartialText(partialText);
	}

}
