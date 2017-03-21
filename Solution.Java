   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
      Queue<Node> nodesToVisit = new LinkedList<Node>();
      TravelToNode(root, nodesToVisit);
    }


    void TravelToNode(Node currentNode, Queue<Node> nodesToVisit){
        //print current node
        System.out.print(currentNode.data + " ");
        
        //add children to end of the line
        if(currentNode.left != null){
            nodesToVisit.add(currentNode.left);
        }
        if(currentNode.right != null){
                nodesToVisit.add(currentNode.right);
        }
        
        //visit the next node in line, highest level nodes will be in the front
        if(nodesToVisit.peek() != null){
           TravelToNode(nodesToVisit.remove(), nodesToVisit);
        }
        
    }

