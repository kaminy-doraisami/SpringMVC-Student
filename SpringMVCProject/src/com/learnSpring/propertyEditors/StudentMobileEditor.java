package com.learnSpring.propertyEditors;

import java.beans.PropertyEditorSupport;

/**
 * @author kaminy.doraisami This is a property editor class to remove characters
 *         in mobile number
 *
 */
public class StudentMobileEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) {
		setValue(text.replaceAll("()-", ""));
	}

}
