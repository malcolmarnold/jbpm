/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jbpm.bpmn2.emfextmodel.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.jbpm.bpmn2.emfextmodel.DocumentRoot;
import org.jbpm.bpmn2.emfextmodel.EmfextmodelPackage;
import org.jbpm.bpmn2.emfextmodel.GlobalType;
import org.jbpm.bpmn2.emfextmodel.ImportType;
import org.jbpm.bpmn2.emfextmodel.OnEntryScriptType;
import org.jbpm.bpmn2.emfextmodel.OnExitScriptType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jbpm.bpmn2.emfextmodel.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.jbpm.bpmn2.emfextmodel.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.jbpm.bpmn2.emfextmodel.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.jbpm.bpmn2.emfextmodel.impl.DocumentRootImpl#getGlobal <em>Global</em>}</li>
 *   <li>{@link org.jbpm.bpmn2.emfextmodel.impl.DocumentRootImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.jbpm.bpmn2.emfextmodel.impl.DocumentRootImpl#getOnEntryScript <em>On Entry Script</em>}</li>
 *   <li>{@link org.jbpm.bpmn2.emfextmodel.impl.DocumentRootImpl#getOnExitScript <em>On Exit Script</em>}</li>
 *   <li>{@link org.jbpm.bpmn2.emfextmodel.impl.DocumentRootImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.jbpm.bpmn2.emfextmodel.impl.DocumentRootImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.jbpm.bpmn2.emfextmodel.impl.DocumentRootImpl#getRuleFlowGroup <em>Rule Flow Group</em>}</li>
 *   <li>{@link org.jbpm.bpmn2.emfextmodel.impl.DocumentRootImpl#getTaskName <em>Task Name</em>}</li>
 *   <li>{@link org.jbpm.bpmn2.emfextmodel.impl.DocumentRootImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

    /**
     * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMLNSPrefixMap()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xMLNSPrefixMap;

    /**
     * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXSISchemaLocation()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xSISchemaLocation;

    /**
     * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackageName()
     * @generated
     * @ordered
     */
    protected static final String PACKAGE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackageName()
     * @generated
     * @ordered
     */
    protected String packageName = PACKAGE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected static final BigInteger PRIORITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected BigInteger priority = PRIORITY_EDEFAULT;

    /**
     * The default value of the '{@link #getRuleFlowGroup() <em>Rule Flow Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRuleFlowGroup()
     * @generated
     * @ordered
     */
    protected static final String RULE_FLOW_GROUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRuleFlowGroup() <em>Rule Flow Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRuleFlowGroup()
     * @generated
     * @ordered
     */
    protected String ruleFlowGroup = RULE_FLOW_GROUP_EDEFAULT;

    /**
     * The default value of the '{@link #getTaskName() <em>Task Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTaskName()
     * @generated
     * @ordered
     */
    protected static final String TASK_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTaskName() <em>Task Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTaskName()
     * @generated
     * @ordered
     */
    protected String taskName = TASK_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final BigInteger VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected BigInteger version = VERSION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EmfextmodelPackage.Literals.DOCUMENT_ROOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, EmfextmodelPackage.DOCUMENT_ROOT__MIXED);
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getXMLNSPrefixMap() {
        if (xMLNSPrefixMap == null) {
            xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, EmfextmodelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        }
        return xMLNSPrefixMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getXSISchemaLocation() {
        if (xSISchemaLocation == null) {
            xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, EmfextmodelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalType getGlobal() {
        return (GlobalType)getMixed().get(EmfextmodelPackage.Literals.DOCUMENT_ROOT__GLOBAL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGlobal(GlobalType newGlobal, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EmfextmodelPackage.Literals.DOCUMENT_ROOT__GLOBAL, newGlobal, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGlobal(GlobalType newGlobal) {
        ((FeatureMap.Internal)getMixed()).set(EmfextmodelPackage.Literals.DOCUMENT_ROOT__GLOBAL, newGlobal);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImportType getImport() {
        return (ImportType)getMixed().get(EmfextmodelPackage.Literals.DOCUMENT_ROOT__IMPORT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetImport(ImportType newImport, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EmfextmodelPackage.Literals.DOCUMENT_ROOT__IMPORT, newImport, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImport(ImportType newImport) {
        ((FeatureMap.Internal)getMixed()).set(EmfextmodelPackage.Literals.DOCUMENT_ROOT__IMPORT, newImport);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OnEntryScriptType getOnEntryScript() {
        return (OnEntryScriptType)getMixed().get(EmfextmodelPackage.Literals.DOCUMENT_ROOT__ON_ENTRY_SCRIPT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOnEntryScript(OnEntryScriptType newOnEntryScript, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EmfextmodelPackage.Literals.DOCUMENT_ROOT__ON_ENTRY_SCRIPT, newOnEntryScript, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnEntryScript(OnEntryScriptType newOnEntryScript) {
        ((FeatureMap.Internal)getMixed()).set(EmfextmodelPackage.Literals.DOCUMENT_ROOT__ON_ENTRY_SCRIPT, newOnEntryScript);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OnExitScriptType getOnExitScript() {
        return (OnExitScriptType)getMixed().get(EmfextmodelPackage.Literals.DOCUMENT_ROOT__ON_EXIT_SCRIPT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOnExitScript(OnExitScriptType newOnExitScript, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(EmfextmodelPackage.Literals.DOCUMENT_ROOT__ON_EXIT_SCRIPT, newOnExitScript, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnExitScript(OnExitScriptType newOnExitScript) {
        ((FeatureMap.Internal)getMixed()).set(EmfextmodelPackage.Literals.DOCUMENT_ROOT__ON_EXIT_SCRIPT, newOnExitScript);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPackageName(String newPackageName) {
        String oldPackageName = packageName;
        packageName = newPackageName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EmfextmodelPackage.DOCUMENT_ROOT__PACKAGE_NAME, oldPackageName, packageName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPriority(BigInteger newPriority) {
        BigInteger oldPriority = priority;
        priority = newPriority;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EmfextmodelPackage.DOCUMENT_ROOT__PRIORITY, oldPriority, priority));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRuleFlowGroup() {
        return ruleFlowGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRuleFlowGroup(String newRuleFlowGroup) {
        String oldRuleFlowGroup = ruleFlowGroup;
        ruleFlowGroup = newRuleFlowGroup;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EmfextmodelPackage.DOCUMENT_ROOT__RULE_FLOW_GROUP, oldRuleFlowGroup, ruleFlowGroup));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTaskName(String newTaskName) {
        String oldTaskName = taskName;
        taskName = newTaskName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EmfextmodelPackage.DOCUMENT_ROOT__TASK_NAME, oldTaskName, taskName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(BigInteger newVersion) {
        BigInteger oldVersion = version;
        version = newVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EmfextmodelPackage.DOCUMENT_ROOT__VERSION, oldVersion, version));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EmfextmodelPackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case EmfextmodelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case EmfextmodelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
            case EmfextmodelPackage.DOCUMENT_ROOT__GLOBAL:
                return basicSetGlobal(null, msgs);
            case EmfextmodelPackage.DOCUMENT_ROOT__IMPORT:
                return basicSetImport(null, msgs);
            case EmfextmodelPackage.DOCUMENT_ROOT__ON_ENTRY_SCRIPT:
                return basicSetOnEntryScript(null, msgs);
            case EmfextmodelPackage.DOCUMENT_ROOT__ON_EXIT_SCRIPT:
                return basicSetOnExitScript(null, msgs);
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
            case EmfextmodelPackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case EmfextmodelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case EmfextmodelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case EmfextmodelPackage.DOCUMENT_ROOT__GLOBAL:
                return getGlobal();
            case EmfextmodelPackage.DOCUMENT_ROOT__IMPORT:
                return getImport();
            case EmfextmodelPackage.DOCUMENT_ROOT__ON_ENTRY_SCRIPT:
                return getOnEntryScript();
            case EmfextmodelPackage.DOCUMENT_ROOT__ON_EXIT_SCRIPT:
                return getOnExitScript();
            case EmfextmodelPackage.DOCUMENT_ROOT__PACKAGE_NAME:
                return getPackageName();
            case EmfextmodelPackage.DOCUMENT_ROOT__PRIORITY:
                return getPriority();
            case EmfextmodelPackage.DOCUMENT_ROOT__RULE_FLOW_GROUP:
                return getRuleFlowGroup();
            case EmfextmodelPackage.DOCUMENT_ROOT__TASK_NAME:
                return getTaskName();
            case EmfextmodelPackage.DOCUMENT_ROOT__VERSION:
                return getVersion();
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
            case EmfextmodelPackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__GLOBAL:
                setGlobal((GlobalType)newValue);
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__IMPORT:
                setImport((ImportType)newValue);
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__ON_ENTRY_SCRIPT:
                setOnEntryScript((OnEntryScriptType)newValue);
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__ON_EXIT_SCRIPT:
                setOnExitScript((OnExitScriptType)newValue);
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__PACKAGE_NAME:
                setPackageName((String)newValue);
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__PRIORITY:
                setPriority((BigInteger)newValue);
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__RULE_FLOW_GROUP:
                setRuleFlowGroup((String)newValue);
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__TASK_NAME:
                setTaskName((String)newValue);
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__VERSION:
                setVersion((BigInteger)newValue);
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
            case EmfextmodelPackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__GLOBAL:
                setGlobal((GlobalType)null);
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__IMPORT:
                setImport((ImportType)null);
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__ON_ENTRY_SCRIPT:
                setOnEntryScript((OnEntryScriptType)null);
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__ON_EXIT_SCRIPT:
                setOnExitScript((OnExitScriptType)null);
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__PACKAGE_NAME:
                setPackageName(PACKAGE_NAME_EDEFAULT);
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__PRIORITY:
                setPriority(PRIORITY_EDEFAULT);
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__RULE_FLOW_GROUP:
                setRuleFlowGroup(RULE_FLOW_GROUP_EDEFAULT);
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__TASK_NAME:
                setTaskName(TASK_NAME_EDEFAULT);
                return;
            case EmfextmodelPackage.DOCUMENT_ROOT__VERSION:
                setVersion(VERSION_EDEFAULT);
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
            case EmfextmodelPackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case EmfextmodelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case EmfextmodelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case EmfextmodelPackage.DOCUMENT_ROOT__GLOBAL:
                return getGlobal() != null;
            case EmfextmodelPackage.DOCUMENT_ROOT__IMPORT:
                return getImport() != null;
            case EmfextmodelPackage.DOCUMENT_ROOT__ON_ENTRY_SCRIPT:
                return getOnEntryScript() != null;
            case EmfextmodelPackage.DOCUMENT_ROOT__ON_EXIT_SCRIPT:
                return getOnExitScript() != null;
            case EmfextmodelPackage.DOCUMENT_ROOT__PACKAGE_NAME:
                return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
            case EmfextmodelPackage.DOCUMENT_ROOT__PRIORITY:
                return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
            case EmfextmodelPackage.DOCUMENT_ROOT__RULE_FLOW_GROUP:
                return RULE_FLOW_GROUP_EDEFAULT == null ? ruleFlowGroup != null : !RULE_FLOW_GROUP_EDEFAULT.equals(ruleFlowGroup);
            case EmfextmodelPackage.DOCUMENT_ROOT__TASK_NAME:
                return TASK_NAME_EDEFAULT == null ? taskName != null : !TASK_NAME_EDEFAULT.equals(taskName);
            case EmfextmodelPackage.DOCUMENT_ROOT__VERSION:
                return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (mixed: ");
        result.append(mixed);
        result.append(", packageName: ");
        result.append(packageName);
        result.append(", priority: ");
        result.append(priority);
        result.append(", ruleFlowGroup: ");
        result.append(ruleFlowGroup);
        result.append(", taskName: ");
        result.append(taskName);
        result.append(", version: ");
        result.append(version);
        result.append(')');
        return result.toString();
    }

} //DocumentRootImpl
