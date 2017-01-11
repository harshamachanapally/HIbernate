package Sample;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int movieId;
	private String name;
	@ManyToMany@JoinTable(name="screen",joinColumns = @JoinColumn(name="movieId"),
			inverseJoinColumns = @JoinColumn(name="theaterId"),
			uniqueConstraints = @UniqueConstraint(columnNames = {"movieId", "theaterid"}))
	@GenericGenerator(name = "sequence-gen", strategy = "sequence")
	@CollectionId(columns = {@Column(name="screenId")}, generator = "sequence-gen", type = @Type(type= "int"))
	private Collection<Theater> theater = new ArrayList<Theater>();
	
	public Collection<Theater> getTheater() {
		return theater;
	}
	public void setTheater(Collection<Theater> theater) {
		this.theater = theater;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
