package Sample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="screen")
public class Screen {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int screenId;
	@ManyToOne
	@JoinColumn(name="movieId")
	private Movie movie;
	@ManyToOne
	@JoinColumn(name="theaterId")
	private Theater theater;
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Theater getTheater() {
		return theater;
	}
	public void setTheater(Theater theater) {
		this.theater = theater;
	}
	
}
