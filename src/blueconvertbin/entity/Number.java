package blueconvertbin.entity;

import java.io.Serializable;
import java.util.Objects;

public class Number implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int number;

	public Number() {
		// TODO Auto-generated constructor stub
	}

	public Number(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
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
		Number other = (Number) obj;
		return number == other.number;
	}

	@Override
	public String toString() {
		return "Number [number=" + number + "]";
	}

}
