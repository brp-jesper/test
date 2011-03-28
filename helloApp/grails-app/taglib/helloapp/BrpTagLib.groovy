package helloapp

class BrpTagLib {
  static namespace = 'brp';

  def toUpper = {attrs, body ->
      out << body().toString().toUpperCase()
  }

  def note = { attrs, body ->
    String style = "pinned_c";
    if (attrs.style) style=attrs.style

    String txtOriginal = body().toString().trim()
    String txtPiped = txtOriginal.replaceAll("\n","|")

    def url = "http://chart.googleapis.com/chart?chst=d_fnote_title&chld=" + style +"|1|555555|h|" + txtPiped
    out << "<img src=\"${url}\" alt=\"${txtOriginal}\" \\>"
  }
}
