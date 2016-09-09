<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
	<Order>
		<xsl:attribute name="OrderHeaderKey">
			<xsl:value-of select="Order/@OrderHeaderKey" />
		</xsl:attribute>
		<OrderHoldTypes>
			<OrderHoldType HoldType="Payment_Auth_Hold" ReasonText="Payment Authorized Successfully" Status="1300"/>
		</OrderHoldTypes>
	</Order>
  </xsl:template>
</xsl:stylesheet>