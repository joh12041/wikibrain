/**
 * This class is generated by jOOQ
 */
package org.wikapidia.core.jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class ArticleConcept implements java.io.Serializable {

	private static final long serialVersionUID = -1323095688;

	private java.lang.Integer articleId;
	private java.lang.Integer conceptId;

	public java.lang.Integer getArticleId() {
		return this.articleId;
	}

	public void setArticleId(java.lang.Integer articleId) {
		this.articleId = articleId;
	}

	public java.lang.Integer getConceptId() {
		return this.conceptId;
	}

	public void setConceptId(java.lang.Integer conceptId) {
		this.conceptId = conceptId;
	}
}
