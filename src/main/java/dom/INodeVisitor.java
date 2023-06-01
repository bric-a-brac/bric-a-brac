package dom;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public interface INodeVisitor
	{
	/**
	 * @since 0.1.0
	 */
	public void visit(Document document);

	/**
	 * @since 0.1.0
	 */
	public void visit(Node node);

	/**
	 * @since 0.1.0
	 */
	public void startNode(Node node, int level);

	/**
	 * @since 0.1.0
	 */
	public void endNode(Node node, int level);
	}
