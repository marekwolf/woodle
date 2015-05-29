package woodle.web.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "TASK")
public class Task implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "generator", strategy = "identity")
	@GeneratedValue(generator = "generator")
	private Long id;

	private String text;

	


	private int priority;
	/**
	 * preferovana lokalizace
	 */
	private String locale;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void getPriority(int priority){
		this.priority = priority;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}

	
	@Override
	public String toString() {
		return "User [id=" + id + ", text=" + text + ", locale=" + locale + ", priotity=" + priority + "]";
	}

}
