package magym.core.data.util

import org.jsoup.Connection
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

internal fun getDocument(url: String): Document = Jsoup.connect(url).init().execute().parse()

internal fun Elements.second() = if (isEmpty()) null else get(1)

private fun Connection.init() = this
	.ignoreContentType(true)
	.userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0")
	.timeout(12000)
