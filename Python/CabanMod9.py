""" Abraham Caban Rios
Module 9
7/8/2023"""


from lxml import etree

# XML document
xml = '''
<characters>
  <character>
    <name>Superman</name>
    <powers>
      <power>superhuman strength</power>
      <power>flight</power>
      <power>invulnerability</power>
      <power>superhero</power>
    </powers>
  </character>
  <character>
    <name>Batman</name>
    <powers>
      <power>master detective</power>
      <power>strategic planning</power>
      <power>combat skills</power>
    </powers>
  </character>
  <character>
    <name>Wonder Woman</name>
    <powers>
      <power>superhuman strength</power>
      <power>flight</power>
      <power>combat skills</power>
    </powers>
  </character>
</characters>
'''

# Parse the XML document
root = etree.fromstring(xml)

# Define the XPath expression
xpath_expr = "//character[powers/power='superhero']/name"

# Apply the XPath expression
result = root.xpath(xpath_expr)

# Print the character names
for character_name in result:
    print(character_name.text)
