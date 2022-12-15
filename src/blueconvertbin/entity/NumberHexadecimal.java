package blueconvertbin.entity;

import java.io.Serializable;
import java.util.Objects;

public class NumberHexadecimal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String number;

	public NumberHexadecimal() {
		// TODO Auto-generated constructor stub
	}

	public NumberHexadecimal(String number) {
		super();
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NumberHexadecimal other = (NumberHexadecimal) obj;
		return Objects.equals(number, other.number);
	}

	@Override
	public String toString() {
		return "NumberHexadecimal [number=" + number + "]";
	}

}
