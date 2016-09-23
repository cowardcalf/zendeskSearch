package test.yangliu.zendesksearch.models;

/**
 * A class of wrapping searching field and value
 * @author Yang Liu
 *
 */
public class SearchValue {
	
	private String field;

	private String value;
	
	public SearchValue(){
		
	}
	
	public SearchValue(String field, String value){
		this.field = field;
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
}
