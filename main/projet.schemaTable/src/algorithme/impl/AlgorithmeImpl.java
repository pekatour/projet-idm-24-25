/**
 */
package algorithme.impl;

import algorithme.Algorithme;
import algorithme.AlgorithmePackage;
import algorithme.Entree;
import algorithme.Langage;
import algorithme.Sortie;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algorithme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithme.impl.AlgorithmeImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link algorithme.impl.AlgorithmeImpl#getRessource <em>Ressource</em>}</li>
 *   <li>{@link algorithme.impl.AlgorithmeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link algorithme.impl.AlgorithmeImpl#getLangage <em>Langage</em>}</li>
 *   <li>{@link algorithme.impl.AlgorithmeImpl#getSortie <em>Sortie</em>}</li>
 *   <li>{@link algorithme.impl.AlgorithmeImpl#getEntree <em>Entree</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlgorithmeImpl extends MinimalEObjectImpl.Container implements Algorithme {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRessource() <em>Ressource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessource()
	 * @generated
	 * @ordered
	 */
	protected static final String RESSOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRessource() <em>Ressource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessource()
	 * @generated
	 * @ordered
	 */
	protected String ressource = RESSOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLangage() <em>Langage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangage()
	 * @generated
	 * @ordered
	 */
	protected static final Langage LANGAGE_EDEFAULT = Langage.PYTHON;

	/**
	 * The cached value of the '{@link #getLangage() <em>Langage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangage()
	 * @generated
	 * @ordered
	 */
	protected Langage langage = LANGAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSortie() <em>Sortie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortie()
	 * @generated
	 * @ordered
	 */
	protected Sortie sortie;

	/**
	 * The cached value of the '{@link #getEntree() <em>Entree</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntree()
	 * @generated
	 * @ordered
	 */
	protected EList<Entree> entree;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgorithmeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmePackage.Literals.ALGORITHME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.ALGORITHME__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRessource() {
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRessource(String newRessource) {
		String oldRessource = ressource;
		ressource = newRessource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.ALGORITHME__RESSOURCE, oldRessource, ressource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.ALGORITHME__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Langage getLangage() {
		return langage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangage(Langage newLangage) {
		Langage oldLangage = langage;
		langage = newLangage == null ? LANGAGE_EDEFAULT : newLangage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.ALGORITHME__LANGAGE, oldLangage, langage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sortie getSortie() {
		return sortie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortie(Sortie newSortie, NotificationChain msgs) {
		Sortie oldSortie = sortie;
		sortie = newSortie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgorithmePackage.ALGORITHME__SORTIE, oldSortie, newSortie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSortie(Sortie newSortie) {
		if (newSortie != sortie) {
			NotificationChain msgs = null;
			if (sortie != null)
				msgs = ((InternalEObject)sortie).eInverseRemove(this, AlgorithmePackage.SORTIE__ALGORITHME, Sortie.class, msgs);
			if (newSortie != null)
				msgs = ((InternalEObject)newSortie).eInverseAdd(this, AlgorithmePackage.SORTIE__ALGORITHME, Sortie.class, msgs);
			msgs = basicSetSortie(newSortie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.ALGORITHME__SORTIE, newSortie, newSortie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entree> getEntree() {
		if (entree == null) {
			entree = new EObjectContainmentWithInverseEList<Entree>(Entree.class, this, AlgorithmePackage.ALGORITHME__ENTREE, AlgorithmePackage.ENTREE__ALGORITHME);
		}
		return entree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmePackage.ALGORITHME__SORTIE:
				if (sortie != null)
					msgs = ((InternalEObject)sortie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgorithmePackage.ALGORITHME__SORTIE, null, msgs);
				return basicSetSortie((Sortie)otherEnd, msgs);
			case AlgorithmePackage.ALGORITHME__ENTREE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntree()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmePackage.ALGORITHME__SORTIE:
				return basicSetSortie(null, msgs);
			case AlgorithmePackage.ALGORITHME__ENTREE:
				return ((InternalEList<?>)getEntree()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmePackage.ALGORITHME__NOM:
				return getNom();
			case AlgorithmePackage.ALGORITHME__RESSOURCE:
				return getRessource();
			case AlgorithmePackage.ALGORITHME__DOCUMENTATION:
				return getDocumentation();
			case AlgorithmePackage.ALGORITHME__LANGAGE:
				return getLangage();
			case AlgorithmePackage.ALGORITHME__SORTIE:
				return getSortie();
			case AlgorithmePackage.ALGORITHME__ENTREE:
				return getEntree();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AlgorithmePackage.ALGORITHME__NOM:
				setNom((String)newValue);
				return;
			case AlgorithmePackage.ALGORITHME__RESSOURCE:
				setRessource((String)newValue);
				return;
			case AlgorithmePackage.ALGORITHME__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case AlgorithmePackage.ALGORITHME__LANGAGE:
				setLangage((Langage)newValue);
				return;
			case AlgorithmePackage.ALGORITHME__SORTIE:
				setSortie((Sortie)newValue);
				return;
			case AlgorithmePackage.ALGORITHME__ENTREE:
				getEntree().clear();
				getEntree().addAll((Collection<? extends Entree>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AlgorithmePackage.ALGORITHME__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case AlgorithmePackage.ALGORITHME__RESSOURCE:
				setRessource(RESSOURCE_EDEFAULT);
				return;
			case AlgorithmePackage.ALGORITHME__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case AlgorithmePackage.ALGORITHME__LANGAGE:
				setLangage(LANGAGE_EDEFAULT);
				return;
			case AlgorithmePackage.ALGORITHME__SORTIE:
				setSortie((Sortie)null);
				return;
			case AlgorithmePackage.ALGORITHME__ENTREE:
				getEntree().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AlgorithmePackage.ALGORITHME__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case AlgorithmePackage.ALGORITHME__RESSOURCE:
				return RESSOURCE_EDEFAULT == null ? ressource != null : !RESSOURCE_EDEFAULT.equals(ressource);
			case AlgorithmePackage.ALGORITHME__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case AlgorithmePackage.ALGORITHME__LANGAGE:
				return langage != LANGAGE_EDEFAULT;
			case AlgorithmePackage.ALGORITHME__SORTIE:
				return sortie != null;
			case AlgorithmePackage.ALGORITHME__ENTREE:
				return entree != null && !entree.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(", ressource: ");
		result.append(ressource);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", langage: ");
		result.append(langage);
		result.append(')');
		return result.toString();
	}

} //AlgorithmeImpl
