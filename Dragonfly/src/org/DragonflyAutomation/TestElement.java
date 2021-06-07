package org.DragonflyAutomation;

class TestElement {
	private Objects[] element;
	private Objects[] error;
	private Objects[] processing;
	private String testApplication;

	Objects[] getElement() {
		return element;
	}

	Objects[] getError() {
		return error;
	}

	Objects[] getProcessing() {
		return processing;
	}

	String getTestApplication() {
		return this.testApplication;
	}

	void setElement(Objects[] element) {
		this.element = element;
	}

	void setError(Objects[] processing) {
		this.processing = processing;
	}

	void setProcessing(Objects[] element) {
		this.element = element;
	}

	void setTestApplication(String logicalName) {
		this.testApplication = logicalName;
	}

	class Objects {
		private String attributeNames;
		private String attributeValues;
		private String logicalName;
		private String tagName;

		String getAttributeNames() {
			return this.attributeNames;
		}

		String getAttributeValues() {
			return this.attributeValues;
		}

		String getLogicalName() {
			return this.logicalName;
		}

		String getTagName() {
			return this.tagName;
		}

		void setAttributeNames(String attributeNames) {
			this.attributeNames = attributeNames;
		}

		void setAttributeValues(String attributeValues) {
			this.attributeValues = attributeValues;
		}

		void setLogicalName(String logicalName) {
			this.logicalName = logicalName;
		}

		void setTagName(String tagName) {
			this.tagName = tagName;
		}
	}
}