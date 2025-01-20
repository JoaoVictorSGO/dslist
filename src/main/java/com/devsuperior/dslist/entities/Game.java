package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Mostra para Java que é uma entidade que representa uma tabela no banco de dados relacional
@Table(name= "tb_game") // Cria a tabela com esse nome no banco
public class Game {
	
	@Id // Essa duas anotação são usada juntas para mostra que é uma chave 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	
	@Column(name = "game_year") // O nome year é uma palavra reservada do SQl, então da para alterar esse nome com essa anotação
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	// Quando tem um camelCase, ele automaticamente cria um sublinhada ex: short_description.
	@Column(columnDefinition = "TEXT")
	private String shortDescription;
	//Caso não coloque essa anotação, JPA vai colocar um varchar que vai até 255.
	@Column(columnDefinition = "TEXT")// alterando para TEXT
	private String longDescription;
	
	public Game() {
	}

	public Game(Long id, String title, Integer year, String genre, Double score, String platforms, String imgUrl,
			String shortDescription, String longDescription) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.score = score;
		this.platforms = platforms;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}

	
	
	
}
