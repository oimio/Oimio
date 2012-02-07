package ch.amaba.model.bo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import ch.amaba.model.bo.constants.TypeCouleurCheveux;
import ch.amaba.model.bo.constants.TypeCouleurYeux;
import ch.amaba.model.bo.constants.TypeRaceEnum;

/**
 * Classe qui définit les propriétés physique d'une personne.
 * */
public class PhysiqueCriteria implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer poidsMin;
	private Integer tailleMin;
	private Integer poidsMax;
	private Integer tailleMax;
	private Set<Integer> couleurYeux;
	private Set<Integer> couleurCheveux;
	private Set<Integer> race;

	public Integer getPoidsMin() {
		return poidsMin;
	}

	public void setPoidsMin(Integer poidsMin) {
		this.poidsMin = poidsMin;
	}

	public Integer getTailleMin() {
		return tailleMin;
	}

	public void setTailleMin(Integer tailleMin) {
		this.tailleMin = tailleMin;
	}

	public Integer getPoidsMax() {
		return poidsMax;
	}

	public void setPoidsMax(Integer poidsMax) {
		this.poidsMax = poidsMax;
	}

	public Integer getTailleMax() {
		return tailleMax;
	}

	public void setTailleMax(Integer tailleMax) {
		this.tailleMax = tailleMax;
	}

	public Set<Integer> getCouleurYeux() {
		return couleurYeux;
	}

	public void setCouleurYeux(Set<Integer> couleurYeux) {
		this.couleurYeux = couleurYeux;
	}

	public Set<Integer> getCouleurCheveux() {
		return couleurCheveux;
	}

	public void setCouleurCheveux(Set<Integer> couleurCheveux) {
		this.couleurCheveux = couleurCheveux;
	}

	public void addCouleurCheveux(TypeCouleurCheveux typeCouleurCheveux) {
		if (couleurCheveux == null) {
			couleurCheveux = new HashSet<Integer>();
		}
		couleurCheveux.add(typeCouleurCheveux.getId());
	}

	public void addCouleurYeux(TypeCouleurYeux typeCouleurYeux) {
		if (couleurYeux == null) {
			couleurYeux = new HashSet<Integer>();
		}
		couleurYeux.add(typeCouleurYeux.getId());
	}

	/**
	 * Ajouter un critère de race.
	 * 
	 * @param raceEnum
	 */
	public void addRace(TypeRaceEnum raceEnum) {
		if (race == null) {
			race = new HashSet<Integer>();
		}
		race.add(raceEnum.getId());
	}

	public Set<Integer> getRace() {
		return race;
	}

	public void setRace(Set<Integer> race) {
		this.race = race;
	}
}