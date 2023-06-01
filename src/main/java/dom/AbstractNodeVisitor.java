package dom;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public abstract class AbstractNodeVisitor implements INodeVisitor
	{
	/**
	 * @since 0.1.0
	 */
	@Override
	public final void visit(final Document document)
		{
		visit((Node) document);
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final void visit(final Node node)
		{
		visit(notNull(node), 0);
		}

	/**
	 * @since 0.1.0
	 */
	private final void visit(final Node node, final int level)
		{
		startNode(node, level);

		final var nodes = node.getChildNodes();

		final var length = nodes.getLength();

		for (int i = 0; i < length; i++)
			{
			final var childNode = nodes.item(i);

			visit(childNode, level + 1);
			}

		endNode(node, level);
		}
	}
