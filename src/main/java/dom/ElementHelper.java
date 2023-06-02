package dom;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.apache.commons.math3.exception.NullArgumentException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class ElementHelper
	{
	protected final Element element;

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public ElementHelper(final Element element)
		{
		super();

		this.element = notNull(element);
		}

	/**
	 * @throws NullArgumentException
	 * @throws ClassCastException
	 * 
	 * @since 0.1.0
	 */
	public ElementHelper(final Node node)
		{
		this((Element) node);
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public final String getAttribute(final String name)
		{
		return getAttribute(null, name);
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public final String getAttribute(final String namespace, final String name)
		{
			//element.hasAttributeNS(namespace, name)
		return element.getAttributeNS(namespace, notNull(name));
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public final List<ElementHelper> getElements(final String name)
		{
		return getElements(null, name);
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public final List<ElementHelper> getElements(final String namespace, final String name)
		{
		return nodeListToListOfElementHelper(element.getElementsByTagNameNS(namespace, notNull(name)));
		}

	/**
	 * @since 0.1.0
	 */
	@SuppressWarnings("unused")
	private static final Optional<Node> getFirstNode(final NodeList nodes)
		{
		notNull(nodes);

		if (nodes.getLength() > 0)
			{
			return Optional.of(nodes.item(0));
			}

		return Optional.empty();
		}

	/**
	 * @throws NullArgumentException
	 * @throws ClassCastException
	 * 
	 * @since 0.1.0
	 */
	private static final List<ElementHelper> nodeListToListOfElementHelper(final NodeList nodes)
		{
		notNull(nodes);

		final var elements = new ArrayList<ElementHelper>();

		final int length = nodes.getLength();

		for (var i = 0; i < length; i++)
			{
			elements.add(new ElementHelper(nodes.item(i)));
			}

		return elements;
		}
	}
