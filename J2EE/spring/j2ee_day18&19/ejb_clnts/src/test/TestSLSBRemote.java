package test;

import javax.ejb.Remote;

@Remote
public interface TestSLSBRemote {
	String echo(String s);
}
