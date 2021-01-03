class FlattenList
{
    Node flatten(Node root)
    {
	    Node curr=root;
	    Node prev=null;
	    while(curr->next!=null)
	    {
	        prev=getLastNode(curr);
	        prev->bottom=curr->next;
	        curr=curr->next;
	    }
	    return root;
    }
    Node getLastNode(Node node)
    {
        while(node->bottom!=null)
            node=node->bottom;
        return node;
    }
}