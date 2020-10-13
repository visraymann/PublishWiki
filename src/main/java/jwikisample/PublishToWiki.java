package jwikisample;

import org.fastily.jwiki.core.Wiki;

import okhttp3.HttpUrl;

public class PublishToWiki {
	
	public static void main(String[] args) {
		HttpUrl url = HttpUrl.parse("https://test.hinduismpedia.org/api.php");
		Wiki wiki = new Wiki.Builder().withApiEndpoint(url)
					.withApiEndpoint(url)
					.withLogin("Visrayman2@PublishWikiPagesInJava", "kr3muuppnh72cv5kjtms0n7icggqsecvs") //Replace with your both username and password.
					.withDebug(true)
					.build();
				//	.withLogin("Visrayman2", "Se......2")			    	
			    //.withLogin("Dashsant@swamiji2", "pr7oitun1ui25hdllr7e2drbegge5oql")
		
		String pageTitle = "First Page";
		String content = "Sample page .... ";
		String publishComments = "First Commit through JWiki"; 
		
		publishPage(wiki, pageTitle, content, publishComments);
	}

	private static void publishPage(Wiki wiki, String pageTitle, String content, String publishComments) {
		boolean response = wiki.edit(pageTitle , content, publishComments);
		System.out.println("Response: " + response); 
		System.out.println("Page: " + wiki);
	}

}
