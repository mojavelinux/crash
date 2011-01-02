import org.crsh.jcr.command.PathArg;

import org.crsh.cmdline.ParameterDescriptor;
import javax.jcr.Session;
import javax.jcr.Node;
import javax.jcr.NodeIterator;
import javax.jcr.Item;

public class commit extends org.crsh.jcr.command.JCRCommand {

  @Command(description="Change the current directory")
  public Object main(@PathArg String path) throws ScriptException {
    assertConnected();
    def node = findNodeByPath(path);
    setCurrentNode(node);
  }
}
