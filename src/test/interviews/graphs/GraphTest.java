package interviews.graphs;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class.
 * @author Francois Rousseau
 */
public class GraphTest {

  public static Graph setUp() {
    Graph g = new Graph(13);
    Assert.assertEquals(true, g.addEdge(0, 1));
    Assert.assertEquals(true, g.addEdge(0, 2));
    Assert.assertEquals(true, g.addEdge(0, 5));
    Assert.assertEquals(true, g.addEdge(0, 6));
    Assert.assertEquals(true, g.addEdge(5, 3));
    Assert.assertEquals(true, g.addEdge(3, 4));
    Assert.assertEquals(true, g.addEdge(6, 4));
    Assert.assertEquals(true, g.addEdge(7, 8));
    Assert.assertEquals(true, g.addEdge(9, 10));
    Assert.assertEquals(true, g.addEdge(9, 11));
    Assert.assertEquals(true, g.addEdge(9, 12));
    Assert.assertEquals(true, g.addEdge(11, 12));
    return g;
  }

  public static Graph setUpWeighted() {
    Graph g = new Graph(8);
    Assert.assertEquals(true, g.addEdge(0, 7, 0.16));
    Assert.assertEquals(true, g.addEdge(2, 3, 0.17));
    Assert.assertEquals(true, g.addEdge(1, 7, 0.19));
    Assert.assertEquals(true, g.addEdge(0, 2, 0.26));
    Assert.assertEquals(true, g.addEdge(5, 7, 0.28));
    Assert.assertEquals(true, g.addEdge(1, 3, 0.29));
    Assert.assertEquals(true, g.addEdge(1, 5, 0.32));
    Assert.assertEquals(true, g.addEdge(2, 7, 0.34));
    Assert.assertEquals(true, g.addEdge(4, 5, 0.35));
    Assert.assertEquals(true, g.addEdge(1, 2, 0.36));
    Assert.assertEquals(true, g.addEdge(4, 7, 0.37));
    Assert.assertEquals(true, g.addEdge(0, 4, 0.38));
    Assert.assertEquals(true, g.addEdge(6, 2, 0.40));
    Assert.assertEquals(true, g.addEdge(3, 6, 0.52));
    Assert.assertEquals(true, g.addEdge(6, 0, 0.58));
    Assert.assertEquals(true, g.addEdge(6, 4, 0.93));
    return g;
  }

  @Test
  public void test_E() {
    Graph g = setUp();
    Assert.assertEquals(12, g.E());

    g = setUpWeighted();
    Assert.assertEquals(16, g.E());
  }

  @Test
  public void test_V() {
    Graph g = setUp();
    Assert.assertEquals(13, g.V);

    g = setUpWeighted();
    Assert.assertEquals(8, g.V);
  }
}
