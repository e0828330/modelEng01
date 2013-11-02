/**
 */
package fml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fml.FmlFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface FmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fml/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FmlPackage eINSTANCE = fml.impl.FmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link fml.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fml.impl.FormImpl
	 * @see fml.impl.FmlPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 0;

	/**
	 * The feature id for the '<em><b>Organized</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ORGANIZED = 0;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fml.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fml.impl.PageImpl
	 * @see fml.impl.FmlPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PREDECESSOR = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Is Welcome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__IS_WELCOME = 2;

	/**
	 * The feature id for the '<em><b>Consists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CONSISTS = 3;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fml.impl.PageElementImpl <em>Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fml.impl.PageElementImpl
	 * @see fml.impl.FmlPackageImpl#getPageElement()
	 * @generated
	 */
	int PAGE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT__CONTAINED = 0;

	/**
	 * The feature id for the '<em><b>Visible If Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT__VISIBLE_IF_SELECTED = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT__ID = 2;

	/**
	 * The number of structural features of the '<em>Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fml.impl.DisplayElementImpl <em>Display Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fml.impl.DisplayElementImpl
	 * @see fml.impl.FmlPackageImpl#getDisplayElement()
	 * @generated
	 */
	int DISPLAY_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_ELEMENT__CONTAINED = PAGE_ELEMENT__CONTAINED;

	/**
	 * The feature id for the '<em><b>Visible If Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_ELEMENT__VISIBLE_IF_SELECTED = PAGE_ELEMENT__VISIBLE_IF_SELECTED;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_ELEMENT__ID = PAGE_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Display Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_ELEMENT_FEATURE_COUNT = PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Display Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_ELEMENT_OPERATION_COUNT = PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fml.impl.HeadingImpl <em>Heading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fml.impl.HeadingImpl
	 * @see fml.impl.FmlPackageImpl#getHeading()
	 * @generated
	 */
	int HEADING = 4;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__CONTAINED = DISPLAY_ELEMENT__CONTAINED;

	/**
	 * The feature id for the '<em><b>Visible If Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__VISIBLE_IF_SELECTED = DISPLAY_ELEMENT__VISIBLE_IF_SELECTED;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__ID = DISPLAY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__LEVEL = DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__TEXT = DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_FEATURE_COUNT = DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_OPERATION_COUNT = DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fml.impl.TextParagraphImpl <em>Text Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fml.impl.TextParagraphImpl
	 * @see fml.impl.FmlPackageImpl#getTextParagraph()
	 * @generated
	 */
	int TEXT_PARAGRAPH = 5;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAGRAPH__CONTAINED = DISPLAY_ELEMENT__CONTAINED;

	/**
	 * The feature id for the '<em><b>Visible If Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAGRAPH__VISIBLE_IF_SELECTED = DISPLAY_ELEMENT__VISIBLE_IF_SELECTED;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAGRAPH__ID = DISPLAY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAGRAPH__TEXT = DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAGRAPH_FEATURE_COUNT = DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAGRAPH_OPERATION_COUNT = DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fml.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fml.impl.ListImpl
	 * @see fml.impl.FmlPackageImpl#getList()
	 * @generated
	 */
	int LIST = 6;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CONTAINED = DISPLAY_ELEMENT__CONTAINED;

	/**
	 * The feature id for the '<em><b>Visible If Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__VISIBLE_IF_SELECTED = DISPLAY_ELEMENT__VISIBLE_IF_SELECTED;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ID = DISPLAY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__IS_ORDERED = DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CONSISTS = DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fml.impl.ListItemImpl <em>List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fml.impl.ListItemImpl
	 * @see fml.impl.FmlPackageImpl#getListItem()
	 * @generated
	 */
	int LIST_ITEM = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__TEXT = 0;

	/**
	 * The number of structural features of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fml.impl.InputElementImpl <em>Input Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fml.impl.InputElementImpl
	 * @see fml.impl.FmlPackageImpl#getInputElement()
	 * @generated
	 */
	int INPUT_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__CONTAINED = PAGE_ELEMENT__CONTAINED;

	/**
	 * The feature id for the '<em><b>Visible If Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__VISIBLE_IF_SELECTED = PAGE_ELEMENT__VISIBLE_IF_SELECTED;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__ID = PAGE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__IS_MANDATORY = PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT_FEATURE_COUNT = PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT_OPERATION_COUNT = PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fml.impl.TextInputImpl <em>Text Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fml.impl.TextInputImpl
	 * @see fml.impl.FmlPackageImpl#getTextInput()
	 * @generated
	 */
	int TEXT_INPUT = 9;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__CONTAINED = INPUT_ELEMENT__CONTAINED;

	/**
	 * The feature id for the '<em><b>Visible If Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__VISIBLE_IF_SELECTED = INPUT_ELEMENT__VISIBLE_IF_SELECTED;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__ID = INPUT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__IS_MANDATORY = INPUT_ELEMENT__IS_MANDATORY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__LABEL = INPUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__TYPE = INPUT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__CONTENT = INPUT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FEATURE_COUNT = INPUT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_OPERATION_COUNT = INPUT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fml.impl.SelectFieldImpl <em>Select Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fml.impl.SelectFieldImpl
	 * @see fml.impl.FmlPackageImpl#getSelectField()
	 * @generated
	 */
	int SELECT_FIELD = 10;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FIELD__CONTAINED = INPUT_ELEMENT__CONTAINED;

	/**
	 * The feature id for the '<em><b>Visible If Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FIELD__VISIBLE_IF_SELECTED = INPUT_ELEMENT__VISIBLE_IF_SELECTED;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FIELD__ID = INPUT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FIELD__IS_MANDATORY = INPUT_ELEMENT__IS_MANDATORY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FIELD__LABEL = INPUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FIELD__TYPE = INPUT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Consists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FIELD__CONSISTS = INPUT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Select Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FIELD_FEATURE_COUNT = INPUT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Select Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FIELD_OPERATION_COUNT = INPUT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fml.impl.SelectionItemImpl <em>Selection Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fml.impl.SelectionItemImpl
	 * @see fml.impl.FmlPackageImpl#getSelectionItem()
	 * @generated
	 */
	int SELECTION_ITEM = 11;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ITEM__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Preselected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ITEM__PRESELECTED = 1;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ITEM__SELECTED = 2;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ITEM__CONTAINED = 3;

	/**
	 * The feature id for the '<em><b>Display Element Visible</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ITEM__DISPLAY_ELEMENT_VISIBLE = 4;

	/**
	 * The number of structural features of the '<em>Selection Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ITEM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Selection Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fml.TextInputType <em>Text Input Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fml.TextInputType
	 * @see fml.impl.FmlPackageImpl#getTextInputType()
	 * @generated
	 */
	int TEXT_INPUT_TYPE = 12;

	/**
	 * The meta object id for the '{@link fml.SelectionType <em>Selection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fml.SelectionType
	 * @see fml.impl.FmlPackageImpl#getSelectionType()
	 * @generated
	 */
	int SELECTION_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link fml.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see fml.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the containment reference list '{@link fml.Form#getOrganized <em>Organized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organized</em>'.
	 * @see fml.Form#getOrganized()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Organized();

	/**
	 * Returns the meta object for class '{@link fml.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see fml.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the reference '{@link fml.Page#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecessor</em>'.
	 * @see fml.Page#getPredecessor()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Predecessor();

	/**
	 * Returns the meta object for the attribute '{@link fml.Page#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see fml.Page#getTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Title();

	/**
	 * Returns the meta object for the attribute '{@link fml.Page#isIsWelcome <em>Is Welcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Welcome</em>'.
	 * @see fml.Page#isIsWelcome()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_IsWelcome();

	/**
	 * Returns the meta object for the containment reference list '{@link fml.Page#getConsists <em>Consists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consists</em>'.
	 * @see fml.Page#getConsists()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Consists();

	/**
	 * Returns the meta object for class '{@link fml.PageElement <em>Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Element</em>'.
	 * @see fml.PageElement
	 * @generated
	 */
	EClass getPageElement();

	/**
	 * Returns the meta object for the container reference '{@link fml.PageElement#getContained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contained</em>'.
	 * @see fml.PageElement#getContained()
	 * @see #getPageElement()
	 * @generated
	 */
	EReference getPageElement_Contained();

	/**
	 * Returns the meta object for the reference list '{@link fml.PageElement#getVisibleIfSelected <em>Visible If Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Visible If Selected</em>'.
	 * @see fml.PageElement#getVisibleIfSelected()
	 * @see #getPageElement()
	 * @generated
	 */
	EReference getPageElement_VisibleIfSelected();

	/**
	 * Returns the meta object for the attribute '{@link fml.PageElement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see fml.PageElement#getID()
	 * @see #getPageElement()
	 * @generated
	 */
	EAttribute getPageElement_ID();

	/**
	 * Returns the meta object for class '{@link fml.DisplayElement <em>Display Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Element</em>'.
	 * @see fml.DisplayElement
	 * @generated
	 */
	EClass getDisplayElement();

	/**
	 * Returns the meta object for class '{@link fml.Heading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heading</em>'.
	 * @see fml.Heading
	 * @generated
	 */
	EClass getHeading();

	/**
	 * Returns the meta object for the attribute '{@link fml.Heading#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see fml.Heading#getLevel()
	 * @see #getHeading()
	 * @generated
	 */
	EAttribute getHeading_Level();

	/**
	 * Returns the meta object for the attribute '{@link fml.Heading#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fml.Heading#getText()
	 * @see #getHeading()
	 * @generated
	 */
	EAttribute getHeading_Text();

	/**
	 * Returns the meta object for class '{@link fml.TextParagraph <em>Text Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Paragraph</em>'.
	 * @see fml.TextParagraph
	 * @generated
	 */
	EClass getTextParagraph();

	/**
	 * Returns the meta object for the attribute '{@link fml.TextParagraph#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fml.TextParagraph#getText()
	 * @see #getTextParagraph()
	 * @generated
	 */
	EAttribute getTextParagraph_Text();

	/**
	 * Returns the meta object for class '{@link fml.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see fml.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the attribute '{@link fml.List#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see fml.List#isIsOrdered()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_IsOrdered();

	/**
	 * Returns the meta object for the containment reference list '{@link fml.List#getConsists <em>Consists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consists</em>'.
	 * @see fml.List#getConsists()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Consists();

	/**
	 * Returns the meta object for class '{@link fml.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item</em>'.
	 * @see fml.ListItem
	 * @generated
	 */
	EClass getListItem();

	/**
	 * Returns the meta object for the attribute '{@link fml.ListItem#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fml.ListItem#getText()
	 * @see #getListItem()
	 * @generated
	 */
	EAttribute getListItem_Text();

	/**
	 * Returns the meta object for class '{@link fml.InputElement <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Element</em>'.
	 * @see fml.InputElement
	 * @generated
	 */
	EClass getInputElement();

	/**
	 * Returns the meta object for the attribute '{@link fml.InputElement#isIsMandatory <em>Is Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mandatory</em>'.
	 * @see fml.InputElement#isIsMandatory()
	 * @see #getInputElement()
	 * @generated
	 */
	EAttribute getInputElement_IsMandatory();

	/**
	 * Returns the meta object for class '{@link fml.TextInput <em>Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input</em>'.
	 * @see fml.TextInput
	 * @generated
	 */
	EClass getTextInput();

	/**
	 * Returns the meta object for the attribute '{@link fml.TextInput#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see fml.TextInput#getLabel()
	 * @see #getTextInput()
	 * @generated
	 */
	EAttribute getTextInput_Label();

	/**
	 * Returns the meta object for the attribute '{@link fml.TextInput#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fml.TextInput#getType()
	 * @see #getTextInput()
	 * @generated
	 */
	EAttribute getTextInput_Type();

	/**
	 * Returns the meta object for the attribute '{@link fml.TextInput#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see fml.TextInput#getContent()
	 * @see #getTextInput()
	 * @generated
	 */
	EAttribute getTextInput_Content();

	/**
	 * Returns the meta object for class '{@link fml.SelectField <em>Select Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Field</em>'.
	 * @see fml.SelectField
	 * @generated
	 */
	EClass getSelectField();

	/**
	 * Returns the meta object for the attribute '{@link fml.SelectField#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see fml.SelectField#getLabel()
	 * @see #getSelectField()
	 * @generated
	 */
	EAttribute getSelectField_Label();

	/**
	 * Returns the meta object for the attribute '{@link fml.SelectField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fml.SelectField#getType()
	 * @see #getSelectField()
	 * @generated
	 */
	EAttribute getSelectField_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link fml.SelectField#getConsists <em>Consists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consists</em>'.
	 * @see fml.SelectField#getConsists()
	 * @see #getSelectField()
	 * @generated
	 */
	EReference getSelectField_Consists();

	/**
	 * Returns the meta object for class '{@link fml.SelectionItem <em>Selection Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Item</em>'.
	 * @see fml.SelectionItem
	 * @generated
	 */
	EClass getSelectionItem();

	/**
	 * Returns the meta object for the attribute '{@link fml.SelectionItem#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fml.SelectionItem#getText()
	 * @see #getSelectionItem()
	 * @generated
	 */
	EAttribute getSelectionItem_Text();

	/**
	 * Returns the meta object for the attribute '{@link fml.SelectionItem#isPreselected <em>Preselected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preselected</em>'.
	 * @see fml.SelectionItem#isPreselected()
	 * @see #getSelectionItem()
	 * @generated
	 */
	EAttribute getSelectionItem_Preselected();

	/**
	 * Returns the meta object for the attribute '{@link fml.SelectionItem#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see fml.SelectionItem#isSelected()
	 * @see #getSelectionItem()
	 * @generated
	 */
	EAttribute getSelectionItem_Selected();

	/**
	 * Returns the meta object for the container reference '{@link fml.SelectionItem#getContained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contained</em>'.
	 * @see fml.SelectionItem#getContained()
	 * @see #getSelectionItem()
	 * @generated
	 */
	EReference getSelectionItem_Contained();

	/**
	 * Returns the meta object for the reference list '{@link fml.SelectionItem#getDisplayElementVisible <em>Display Element Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Display Element Visible</em>'.
	 * @see fml.SelectionItem#getDisplayElementVisible()
	 * @see #getSelectionItem()
	 * @generated
	 */
	EReference getSelectionItem_DisplayElementVisible();

	/**
	 * Returns the meta object for enum '{@link fml.TextInputType <em>Text Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Input Type</em>'.
	 * @see fml.TextInputType
	 * @generated
	 */
	EEnum getTextInputType();

	/**
	 * Returns the meta object for enum '{@link fml.SelectionType <em>Selection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Selection Type</em>'.
	 * @see fml.SelectionType
	 * @generated
	 */
	EEnum getSelectionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FmlFactory getFmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fml.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fml.impl.FormImpl
		 * @see fml.impl.FmlPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Organized</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__ORGANIZED = eINSTANCE.getForm_Organized();

		/**
		 * The meta object literal for the '{@link fml.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fml.impl.PageImpl
		 * @see fml.impl.FmlPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PREDECESSOR = eINSTANCE.getPage_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

		/**
		 * The meta object literal for the '<em><b>Is Welcome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__IS_WELCOME = eINSTANCE.getPage_IsWelcome();

		/**
		 * The meta object literal for the '<em><b>Consists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CONSISTS = eINSTANCE.getPage_Consists();

		/**
		 * The meta object literal for the '{@link fml.impl.PageElementImpl <em>Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fml.impl.PageElementImpl
		 * @see fml.impl.FmlPackageImpl#getPageElement()
		 * @generated
		 */
		EClass PAGE_ELEMENT = eINSTANCE.getPageElement();

		/**
		 * The meta object literal for the '<em><b>Contained</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_ELEMENT__CONTAINED = eINSTANCE.getPageElement_Contained();

		/**
		 * The meta object literal for the '<em><b>Visible If Selected</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_ELEMENT__VISIBLE_IF_SELECTED = eINSTANCE.getPageElement_VisibleIfSelected();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_ELEMENT__ID = eINSTANCE.getPageElement_ID();

		/**
		 * The meta object literal for the '{@link fml.impl.DisplayElementImpl <em>Display Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fml.impl.DisplayElementImpl
		 * @see fml.impl.FmlPackageImpl#getDisplayElement()
		 * @generated
		 */
		EClass DISPLAY_ELEMENT = eINSTANCE.getDisplayElement();

		/**
		 * The meta object literal for the '{@link fml.impl.HeadingImpl <em>Heading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fml.impl.HeadingImpl
		 * @see fml.impl.FmlPackageImpl#getHeading()
		 * @generated
		 */
		EClass HEADING = eINSTANCE.getHeading();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADING__LEVEL = eINSTANCE.getHeading_Level();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADING__TEXT = eINSTANCE.getHeading_Text();

		/**
		 * The meta object literal for the '{@link fml.impl.TextParagraphImpl <em>Text Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fml.impl.TextParagraphImpl
		 * @see fml.impl.FmlPackageImpl#getTextParagraph()
		 * @generated
		 */
		EClass TEXT_PARAGRAPH = eINSTANCE.getTextParagraph();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_PARAGRAPH__TEXT = eINSTANCE.getTextParagraph_Text();

		/**
		 * The meta object literal for the '{@link fml.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fml.impl.ListImpl
		 * @see fml.impl.FmlPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__IS_ORDERED = eINSTANCE.getList_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Consists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__CONSISTS = eINSTANCE.getList_Consists();

		/**
		 * The meta object literal for the '{@link fml.impl.ListItemImpl <em>List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fml.impl.ListItemImpl
		 * @see fml.impl.FmlPackageImpl#getListItem()
		 * @generated
		 */
		EClass LIST_ITEM = eINSTANCE.getListItem();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ITEM__TEXT = eINSTANCE.getListItem_Text();

		/**
		 * The meta object literal for the '{@link fml.impl.InputElementImpl <em>Input Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fml.impl.InputElementImpl
		 * @see fml.impl.FmlPackageImpl#getInputElement()
		 * @generated
		 */
		EClass INPUT_ELEMENT = eINSTANCE.getInputElement();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_ELEMENT__IS_MANDATORY = eINSTANCE.getInputElement_IsMandatory();

		/**
		 * The meta object literal for the '{@link fml.impl.TextInputImpl <em>Text Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fml.impl.TextInputImpl
		 * @see fml.impl.FmlPackageImpl#getTextInput()
		 * @generated
		 */
		EClass TEXT_INPUT = eINSTANCE.getTextInput();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT__LABEL = eINSTANCE.getTextInput_Label();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT__TYPE = eINSTANCE.getTextInput_Type();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT__CONTENT = eINSTANCE.getTextInput_Content();

		/**
		 * The meta object literal for the '{@link fml.impl.SelectFieldImpl <em>Select Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fml.impl.SelectFieldImpl
		 * @see fml.impl.FmlPackageImpl#getSelectField()
		 * @generated
		 */
		EClass SELECT_FIELD = eINSTANCE.getSelectField();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_FIELD__LABEL = eINSTANCE.getSelectField_Label();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_FIELD__TYPE = eINSTANCE.getSelectField_Type();

		/**
		 * The meta object literal for the '<em><b>Consists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_FIELD__CONSISTS = eINSTANCE.getSelectField_Consists();

		/**
		 * The meta object literal for the '{@link fml.impl.SelectionItemImpl <em>Selection Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fml.impl.SelectionItemImpl
		 * @see fml.impl.FmlPackageImpl#getSelectionItem()
		 * @generated
		 */
		EClass SELECTION_ITEM = eINSTANCE.getSelectionItem();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_ITEM__TEXT = eINSTANCE.getSelectionItem_Text();

		/**
		 * The meta object literal for the '<em><b>Preselected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_ITEM__PRESELECTED = eINSTANCE.getSelectionItem_Preselected();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_ITEM__SELECTED = eINSTANCE.getSelectionItem_Selected();

		/**
		 * The meta object literal for the '<em><b>Contained</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_ITEM__CONTAINED = eINSTANCE.getSelectionItem_Contained();

		/**
		 * The meta object literal for the '<em><b>Display Element Visible</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_ITEM__DISPLAY_ELEMENT_VISIBLE = eINSTANCE.getSelectionItem_DisplayElementVisible();

		/**
		 * The meta object literal for the '{@link fml.TextInputType <em>Text Input Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fml.TextInputType
		 * @see fml.impl.FmlPackageImpl#getTextInputType()
		 * @generated
		 */
		EEnum TEXT_INPUT_TYPE = eINSTANCE.getTextInputType();

		/**
		 * The meta object literal for the '{@link fml.SelectionType <em>Selection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fml.SelectionType
		 * @see fml.impl.FmlPackageImpl#getSelectionType()
		 * @generated
		 */
		EEnum SELECTION_TYPE = eINSTANCE.getSelectionType();

	}

} //FmlPackage
