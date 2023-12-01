package com.ilyaflaks.diederoderdas.wort;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Wort {

	public Wort() {
	}

	@Id
	@GeneratedValue
	private Integer id;

	private String word;

	private String article;
	private String translation;

	public Wort(Integer id, String word, String article, String translation) {
		super();
		this.id = id;
		this.word = word;
		this.article = article;
		this.translation = translation;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the word
	 */
	public String getWord() {
		return word;
	}

	/**
	 * @param word the word to set
	 */
	public void setWord(String word) {
		this.word = word;
	}

	/**
	 * @return the article
	 */
	public String getArticle() {
		return article;
	}

	/**
	 * @param article the article to set
	 */
	public void setArticle(String article) {
		this.article = article;
	}

	/**
	 * @return the translation
	 */
	public String getTranslation() {
		return translation;
	}

	/**
	 * @param translation the translation to set
	 */
	public void setTranslation(String translation) {
		this.translation = translation;
	}

	@Override
	public String toString() {
		return "Wort [id=" + id + ", word=" + word + ", article=" + article + ", translation=" + translation + "]";
	}

}
