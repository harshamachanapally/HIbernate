package Sample;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Theater {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int theaterId;
	private String name;
	@ManyToMany(mappedBy="theater")
	private Collection<Movie> movie = new ArrayList<Movie>();
	
	public Collection<Movie> getMovie() {
		return movie;
	}
	public void setMovie(Collection<Movie> movie) {
		this.movie = movie;
	}
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
