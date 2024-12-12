/**
 */
package calcul.impl;

import calcul.Binaire;
import calcul.CalculPackage;
import calcul.Expression;
import calcul.TypeBinaire;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calcul.impl.BinaireImpl#getType <em>Type</em>}</li>
 *   <li>{@link calcul.impl.BinaireImpl#getExpressiong <em>Expressiong</em>}</li>
 *   <li>{@link calcul.impl.BinaireImpl#getExpressiond <em>Expressiond</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaireImpl extends ExpressionImpl implements Binaire {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeBinaire TYPE_EDEFAULT = TypeBinaire.ADDITION;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeBinaire type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpressiong() <em>Expressiong</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressiong()
	 * @generated
	 * @ordered
	 */
	protected Expression expressiong;

	/**
	 * The cached value of the '{@link #getExpressiond() <em>Expressiond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressiond()
	 * @generated
	 * @ordered
	 */
	protected Expression expressiond;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculPackage.Literals.BINAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeBinaire getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeBinaire newType) {
		TypeBinaire oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.BINAIRE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getExpressiong() {
		return expressiong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressiong(Expression newExpressiong, NotificationChain msgs) {
		Expression oldExpressiong = expressiong;
		expressiong = newExpressiong;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CalculPackage.BINAIRE__EXPRESSIONG, oldExpressiong, newExpressiong);
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
	public void setExpressiong(Expression newExpressiong) {
		if (newExpressiong != expressiong) {
			NotificationChain msgs = null;
			if (expressiong != null)
				msgs = ((InternalEObject)expressiong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalculPackage.BINAIRE__EXPRESSIONG, null, msgs);
			if (newExpressiong != null)
				msgs = ((InternalEObject)newExpressiong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalculPackage.BINAIRE__EXPRESSIONG, null, msgs);
			msgs = basicSetExpressiong(newExpressiong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.BINAIRE__EXPRESSIONG, newExpressiong, newExpressiong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getExpressiond() {
		return expressiond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressiond(Expression newExpressiond, NotificationChain msgs) {
		Expression oldExpressiond = expressiond;
		expressiond = newExpressiond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CalculPackage.BINAIRE__EXPRESSIOND, oldExpressiond, newExpressiond);
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
	public void setExpressiond(Expression newExpressiond) {
		if (newExpressiond != expressiond) {
			NotificationChain msgs = null;
			if (expressiond != null)
				msgs = ((InternalEObject)expressiond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalculPackage.BINAIRE__EXPRESSIOND, null, msgs);
			if (newExpressiond != null)
				msgs = ((InternalEObject)newExpressiond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalculPackage.BINAIRE__EXPRESSIOND, null, msgs);
			msgs = basicSetExpressiond(newExpressiond, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.BINAIRE__EXPRESSIOND, newExpressiond, newExpressiond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CalculPackage.BINAIRE__EXPRESSIONG:
				return basicSetExpressiong(null, msgs);
			case CalculPackage.BINAIRE__EXPRESSIOND:
				return basicSetExpressiond(null, msgs);
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
			case CalculPackage.BINAIRE__TYPE:
				return getType();
			case CalculPackage.BINAIRE__EXPRESSIONG:
				return getExpressiong();
			case CalculPackage.BINAIRE__EXPRESSIOND:
				return getExpressiond();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CalculPackage.BINAIRE__TYPE:
				setType((TypeBinaire)newValue);
				return;
			case CalculPackage.BINAIRE__EXPRESSIONG:
				setExpressiong((Expression)newValue);
				return;
			case CalculPackage.BINAIRE__EXPRESSIOND:
				setExpressiond((Expression)newValue);
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
			case CalculPackage.BINAIRE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CalculPackage.BINAIRE__EXPRESSIONG:
				setExpressiong((Expression)null);
				return;
			case CalculPackage.BINAIRE__EXPRESSIOND:
				setExpressiond((Expression)null);
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
			case CalculPackage.BINAIRE__TYPE:
				return type != TYPE_EDEFAULT;
			case CalculPackage.BINAIRE__EXPRESSIONG:
				return expressiong != null;
			case CalculPackage.BINAIRE__EXPRESSIOND:
				return expressiond != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //BinaireImpl
