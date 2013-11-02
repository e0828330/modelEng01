/**
 */
package fml.impl;

import fml.DisplayElement;
import fml.FmlFactory;
import fml.FmlPackage;
import fml.Form;
import fml.Heading;
import fml.InputElement;
import fml.List;
import fml.ListItem;
import fml.Page;
import fml.PageElement;
import fml.SelectField;
import fml.SelectionItem;
import fml.SelectionType;
import fml.TextInput;
import fml.TextInputType;
import fml.TextParagraph;

import fml.util.FmlValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FmlPackageImpl extends EPackageImpl implements FmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textParagraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textInputTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum selectionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fml.FmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FmlPackageImpl() {
		super(eNS_URI, FmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FmlPackage init() {
		if (isInited) return (FmlPackage)EPackage.Registry.INSTANCE.getEPackage(FmlPackage.eNS_URI);

		// Obtain or create and register package
		FmlPackageImpl theFmlPackage = (FmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FmlPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFmlPackage.createPackageContents();

		// Initialize created meta-data
		theFmlPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFmlPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return FmlValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FmlPackage.eNS_URI, theFmlPackage);
		return theFmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_Organized() {
		return (EReference)formEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Predecessor() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Title() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_IsWelcome() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Consists() {
		return (EReference)pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageElement() {
		return pageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageElement_Contained() {
		return (EReference)pageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageElement_VisibleIfSelected() {
		return (EReference)pageElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageElement_ID() {
		return (EAttribute)pageElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayElement() {
		return displayElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeading() {
		return headingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeading_Level() {
		return (EAttribute)headingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeading_Text() {
		return (EAttribute)headingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextParagraph() {
		return textParagraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextParagraph_Text() {
		return (EAttribute)textParagraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getList() {
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_IsOrdered() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Consists() {
		return (EReference)listEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListItem() {
		return listItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListItem_Text() {
		return (EAttribute)listItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputElement() {
		return inputElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputElement_IsMandatory() {
		return (EAttribute)inputElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextInput() {
		return textInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInput_Label() {
		return (EAttribute)textInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInput_Type() {
		return (EAttribute)textInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInput_Content() {
		return (EAttribute)textInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectField() {
		return selectFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectField_Label() {
		return (EAttribute)selectFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectField_Type() {
		return (EAttribute)selectFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectField_Consists() {
		return (EReference)selectFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionItem() {
		return selectionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionItem_Text() {
		return (EAttribute)selectionItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionItem_Preselected() {
		return (EAttribute)selectionItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionItem_Selected() {
		return (EAttribute)selectionItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectionItem_Contained() {
		return (EReference)selectionItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectionItem_DisplayElementVisible() {
		return (EReference)selectionItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextInputType() {
		return textInputTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSelectionType() {
		return selectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmlFactory getFmlFactory() {
		return (FmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		formEClass = createEClass(FORM);
		createEReference(formEClass, FORM__ORGANIZED);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__PREDECESSOR);
		createEAttribute(pageEClass, PAGE__TITLE);
		createEAttribute(pageEClass, PAGE__IS_WELCOME);
		createEReference(pageEClass, PAGE__CONSISTS);

		pageElementEClass = createEClass(PAGE_ELEMENT);
		createEReference(pageElementEClass, PAGE_ELEMENT__CONTAINED);
		createEReference(pageElementEClass, PAGE_ELEMENT__VISIBLE_IF_SELECTED);
		createEAttribute(pageElementEClass, PAGE_ELEMENT__ID);

		displayElementEClass = createEClass(DISPLAY_ELEMENT);

		headingEClass = createEClass(HEADING);
		createEAttribute(headingEClass, HEADING__LEVEL);
		createEAttribute(headingEClass, HEADING__TEXT);

		textParagraphEClass = createEClass(TEXT_PARAGRAPH);
		createEAttribute(textParagraphEClass, TEXT_PARAGRAPH__TEXT);

		listEClass = createEClass(LIST);
		createEAttribute(listEClass, LIST__IS_ORDERED);
		createEReference(listEClass, LIST__CONSISTS);

		listItemEClass = createEClass(LIST_ITEM);
		createEAttribute(listItemEClass, LIST_ITEM__TEXT);

		inputElementEClass = createEClass(INPUT_ELEMENT);
		createEAttribute(inputElementEClass, INPUT_ELEMENT__IS_MANDATORY);

		textInputEClass = createEClass(TEXT_INPUT);
		createEAttribute(textInputEClass, TEXT_INPUT__LABEL);
		createEAttribute(textInputEClass, TEXT_INPUT__TYPE);
		createEAttribute(textInputEClass, TEXT_INPUT__CONTENT);

		selectFieldEClass = createEClass(SELECT_FIELD);
		createEAttribute(selectFieldEClass, SELECT_FIELD__LABEL);
		createEAttribute(selectFieldEClass, SELECT_FIELD__TYPE);
		createEReference(selectFieldEClass, SELECT_FIELD__CONSISTS);

		selectionItemEClass = createEClass(SELECTION_ITEM);
		createEAttribute(selectionItemEClass, SELECTION_ITEM__TEXT);
		createEAttribute(selectionItemEClass, SELECTION_ITEM__PRESELECTED);
		createEAttribute(selectionItemEClass, SELECTION_ITEM__SELECTED);
		createEReference(selectionItemEClass, SELECTION_ITEM__CONTAINED);
		createEReference(selectionItemEClass, SELECTION_ITEM__DISPLAY_ELEMENT_VISIBLE);

		// Create enums
		textInputTypeEEnum = createEEnum(TEXT_INPUT_TYPE);
		selectionTypeEEnum = createEEnum(SELECTION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		displayElementEClass.getESuperTypes().add(this.getPageElement());
		headingEClass.getESuperTypes().add(this.getDisplayElement());
		textParagraphEClass.getESuperTypes().add(this.getDisplayElement());
		listEClass.getESuperTypes().add(this.getDisplayElement());
		inputElementEClass.getESuperTypes().add(this.getPageElement());
		textInputEClass.getESuperTypes().add(this.getInputElement());
		selectFieldEClass.getESuperTypes().add(this.getInputElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForm_Organized(), this.getPage(), null, "organized", null, 1, -1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_Predecessor(), this.getPage(), null, "predecessor", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_Title(), ecorePackage.getEString(), "Title", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_IsWelcome(), ecorePackage.getEBoolean(), "isWelcome", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Consists(), this.getPageElement(), this.getPageElement_Contained(), "consists", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageElementEClass, PageElement.class, "PageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageElement_Contained(), this.getPage(), this.getPage_Consists(), "contained", null, 0, 1, PageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageElement_VisibleIfSelected(), this.getSelectionItem(), this.getSelectionItem_DisplayElementVisible(), "visibleIfSelected", null, 0, -1, PageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPageElement_ID(), ecorePackage.getEIntegerObject(), "ID", null, 0, 1, PageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayElementEClass, DisplayElement.class, "DisplayElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(headingEClass, Heading.class, "Heading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeading_Level(), ecorePackage.getEIntegerObject(), "Level", null, 0, 1, Heading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeading_Text(), ecorePackage.getEString(), "Text", null, 0, 1, Heading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textParagraphEClass, TextParagraph.class, "TextParagraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextParagraph_Text(), ecorePackage.getEString(), "Text", null, 0, 1, TextParagraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getList_IsOrdered(), ecorePackage.getEBoolean(), "isOrdered", null, 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getList_Consists(), this.getListItem(), null, "consists", null, 1, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listItemEClass, ListItem.class, "ListItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListItem_Text(), ecorePackage.getEString(), "Text", null, 0, 1, ListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputElementEClass, InputElement.class, "InputElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputElement_IsMandatory(), ecorePackage.getEBoolean(), "isMandatory", null, 0, 1, InputElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textInputEClass, TextInput.class, "TextInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextInput_Label(), ecorePackage.getEString(), "Label", null, 0, 1, TextInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInput_Type(), this.getTextInputType(), "Type", null, 0, 1, TextInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextInput_Content(), ecorePackage.getEString(), "Content", null, 0, 1, TextInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectFieldEClass, SelectField.class, "SelectField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectField_Label(), ecorePackage.getEString(), "Label", null, 0, 1, SelectField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectField_Type(), this.getSelectionType(), "Type", null, 0, 1, SelectField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectField_Consists(), this.getSelectionItem(), this.getSelectionItem_Contained(), "consists", null, 1, -1, SelectField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionItemEClass, SelectionItem.class, "SelectionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectionItem_Text(), ecorePackage.getEString(), "Text", null, 0, 1, SelectionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectionItem_Preselected(), ecorePackage.getEBoolean(), "preselected", null, 0, 1, SelectionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectionItem_Selected(), ecorePackage.getEBoolean(), "selected", null, 0, 1, SelectionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectionItem_Contained(), this.getSelectField(), this.getSelectField_Consists(), "contained", null, 0, 1, SelectionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectionItem_DisplayElementVisible(), this.getPageElement(), this.getPageElement_VisibleIfSelected(), "displayElementVisible", null, 0, -1, SelectionItem.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(textInputTypeEEnum, TextInputType.class, "TextInputType");
		addEEnumLiteral(textInputTypeEEnum, TextInputType.TEXTAREA);
		addEEnumLiteral(textInputTypeEEnum, TextInputType.TEXTFIELD);
		addEEnumLiteral(textInputTypeEEnum, TextInputType.ENCRYPTED_TEXTFIELD);

		initEEnum(selectionTypeEEnum, SelectionType.class, "SelectionType");
		addEEnumLiteral(selectionTypeEEnum, SelectionType.RADIO);
		addEEnumLiteral(selectionTypeEEnum, SelectionType.CHECKBOX);
		addEEnumLiteral(selectionTypeEEnum, SelectionType.COMBOBOX);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore#/"
		   });											
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });		
		addAnnotation
		  (formEClass, 
		   source, 
		   new String[] {
			 "constraints", "oneWelcomePage oneFirstPage"
		   });			
		addAnnotation
		  (pageEClass, 
		   source, 
		   new String[] {
			 "constraints", "titleStartsUpperCase noCycles"
		   });			
		addAnnotation
		  (pageElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueID"
		   });			
		addAnnotation
		  (selectFieldEClass, 
		   source, 
		   new String[] {
			 "constraints", "RadioOnlyOneSelected"
		   });			
		addAnnotation
		  (selectionItemEClass, 
		   source, 
		   new String[] {
			 "constraints", "selectionIsOfSubsequentPage"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";					
		addAnnotation
		  (formEClass, 
		   source, 
		   new String[] {
			 "oneWelcomePage", "self.organized->select(p | p.isWelcome)->size() = 1 and self.organized->select(p | p.isWelcome)->forAll(p | p.predecessor->isEmpty())",
			 "oneFirstPage", "self.organized->select(p | p.predecessor->isEmpty())->size() = 1"
		   });			
		addAnnotation
		  (pageEClass, 
		   source, 
		   new String[] {
			 "titleStartsUpperCase", "not (Title.size()=0) and Title.at(1) = Title.at(1).toUpper()",
			 "noCycles", "self.predecessor->asSet()->union(self.predecessor->closure(p | p.predecessor))->excludes(self)"
		   });			
		addAnnotation
		  (pageElementEClass, 
		   source, 
		   new String[] {
			 "uniqueID", "PageElement.allInstances()->forAll(e1, e2 | e1 <> e2 implies e1.oclAsType(PageElement).ID <> e2.oclAsType(PageElement).ID)"
		   });			
		addAnnotation
		  (selectFieldEClass, 
		   source, 
		   new String[] {
			 "RadioOnlyOneSelected", "self.Type <> SelectionType::RADIO or (self.consists->forAll(i | i.preselected)->size() <= 1 and self.consists->forAll(i | i.selected)->size() <= 1)"
		   });			
		addAnnotation
		  (selectionItemEClass, 
		   source, 
		   new String[] {
			 "selectionIsOfSubsequentPage", "self.displayElementVisible -> forAll(e |e.contained.predecessor->asSet()->union(e.contained.predecessor->closure(p | p.predecessor))->includes(self.contained.contained))"
		   });
	}

} //FmlPackageImpl
