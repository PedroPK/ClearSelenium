package clearSelenium.fundamentus;

public class FundamentalistIndicatorsFundamentus extends FundamentalistIndicators {
	
	/************************************************************************/
	 // First Column
	/************************************************************************/
	
	/**
	 * Preço sobre Lucro
	 * 
	 * Preço da ação dividido pelo lucro por ação. 
	 * O P/L é o número de anos que se levaria para reaver o capital aplicado na compra de uma ação, 
	 * através do recebimento do lucro gerado pela empresa, considerando que esses lucros permaneçam constantes.
	 */
	@Override
	protected String getPriceOverProfit_XPath() {
		String	PRICE_OVER_PROFIT_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[2]/td[4]/span";
		return PRICE_OVER_PROFIT_XPATH;
	}
	
	
	
	/**
	 * Preço sobre Valor Patrimonial
	 * 
	 * Preço da ação dividido pelo Valor Patrimonial por ação. 
	 * Informa quanto o mercado está disposto a pagar sobre o Patrimônio Líquido da empresa
	 */
	@Override
	protected String getPriceOverBookValue_XPath() {
		String	PRICE_OVER_BOOK_VALUE_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[3]/td[4]/span";
		return PRICE_OVER_BOOK_VALUE_XPATH;
	}
	
	/**
	 * Preço sobre EBIT
	 * 
	 * Preço da ação dividido pelo EBIT por ação. EBIT é o Lucro antes dos Impostos e Despesas Financeiras. 
	 * É uma boa aproximação do lucro operacional da empresa.
	 */
	@Override
	protected String getPriceOverEBIT_XPath() {
		String	PRICE_OVER_EBIT_XPATH	=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[4]/td[4]/span";
		return PRICE_OVER_EBIT_XPATH;
	}
	
	/**
	 * Price Sales Ratio: Preço da ação dividido pela Receita Líquida por ação
	 */
	@Override
	protected String getPriceSalesRatio_XPath() {
		String	PRICE_SALES_RATIO_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[5]/td[4]/span";
		return PRICE_SALES_RATIO_XPATH;
	}
	
	/**
	 * Preço sobre Ativos
	 * 
	 * Preço da ação dividido pelos Ativos totais por ação.
	 */
	@Override
	protected String getPriceOverAssets_XPath() {
		String	PRICE_OVER_ASSETS_XPATH			=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[6]/td[4]/span";
		return PRICE_OVER_ASSETS_XPATH;
	}
	
	/**
	 * Preço sobre Capital de Giro
	 * 
	 * Preço da ação dividido pelo capital de giro por ação. Capital de giro é o Ativo Circulante menos Passivo Circulante
	 */
	@Override
	protected String getPriceOverWorkingCapital_XPath() {
		String	PRICE_OVER_WORKING_CAPITAL_XPATH	=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[7]/td[4]/span";
		return PRICE_OVER_WORKING_CAPITAL_XPATH;
	}
	
	/**
	 * Preço sobre o Ativo Circulante Líquido
	 * 
	 * Preço da ação dividido pelos Ativos Circulantes Líquidos por ação. 
	 * Ativo Circ. Líq. é obtido subtraindo os ativos circulantes pelas dívidas de curto e longo prazo, ou seja, 
	 * após o pagamento de todas as dívidas, quanto sobraria dos ativos mais líquidos da empresa (caixa, estoque, etc)
	 */
	@Override
	protected String getPriceOverNetCurrentAsset_XPath() {
		String	PRICE_OVER_NET_CURRENT_ASSET_XPATH	=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[8]/td[4]/span";
		return PRICE_OVER_NET_CURRENT_ASSET_XPATH;
	}
	/**
	 * Dividend Yield
	 * 
	 * Dividendo pago por ação dividido pelo preço da ação. É o rendimento gerado para o dono da ação pelo pagamento de dividendos.
	 */
	@Override
	protected String getDividentYield_XPath() {
		String	DIVIDEND_YIELD_XPATH	=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[9]/td[4]/span";
		return DIVIDEND_YIELD_XPATH;
	}
	
	/**
	 * Valor da Firma (Enterprise Value dividido pelo EBIT.
	 */
	@Override
	protected String getEnterpriseValueOverEBIT_XPath() {
		String	ENTERPRISE_VALUE_OVER_EBIT_XPATH	=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[10]/td[4]/span";
		return ENTERPRISE_VALUE_OVER_EBIT_XPATH;
	}
	
	/**
	 * Giro do Ativo
	 * 
	 * Receita Líquida dividido por Ativos Totais. 
	 * Indica a eficiência com a qual a empresa usa seus ativos para gerar vendas
	 */
	@Override
	protected String getAssetTurnover_XPath() {
		String	ASSET_TURNOVER_XPATH	=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[11]/td[4]/span";
		return ASSET_TURNOVER_XPATH;
	}
	
	/**
	 * Crescimento da Receita Líquida nos últimos 5 anos
	 */
	@Override
	protected String getIncomeGrowthLast5Years_XPath() {
		String	INCOME_GROWTH_LAST_5_YEARS_XPATH	=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[12]/td[4]/span";
		return INCOME_GROWTH_LAST_5_YEARS_XPATH;
	}
	
	/************************************************************************/
	 // Second Column
	/************************************************************************/
	
	
	/**
	 * Lucro por Ação
	 */
	@Override
	protected String getProfitPerAction_XPath() {
		String	PROFIT_PER_ACTION_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[2]/td[6]/span";
		return PROFIT_PER_ACTION_XPATH;
	}
	
	/**
	 * Valor Patrimonial por Ação: Valor do Patrimônio Líquido dividido pelo número total de ações.
	 */
	@Override
	protected String getBookValueOverStocks_XPath() {
		String	BOOK_VALUE_OVER_STOCKS_XPATH	=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[3]/td[6]/span";
		return BOOK_VALUE_OVER_STOCKS_XPATH;
	}
	
	/**
	 * Margem Bruta
	 * 
	 * Lucro Bruto dividido pela Receita Líquida: Indica a porcentagem de cada R$1 de venda que sobrou após o custo dos produtos/serviços vendidos
	 */
	@Override
	protected String getGrossMargin_XPath() {
		String	GROSS_MARGIN_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[4]/td[6]/span";
		return GROSS_MARGIN_XPATH;
	}
	
	/**
	 * Margem EBIT
	 * 
	 * EBIT dividido pela Receita Líquida: 
	 * 		Indica a porcentagem de cada R$1 de venda que sobrou após o pagamento dos custos dos produtos/serviços vendidos, 
	 * 		das despesas com vendas, gerais e administrativas
	 * 
	 * Operational Margin		-		Operation income margin		-		Operating Profit Margin		-		Return of Sales (ROS)
	 */
	@Override
	protected String getEbitMargin_XPath() {
		String	EBIT_MARGIN_XPATH	=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[5]/td[6]/span";
		return EBIT_MARGIN_XPATH;
	}
	
	
	/**
	 * Margem Líquida
	 * 
	 * Lucro Líquido dividido pela Receita Líquida
	 * 
	 * Profit Margin		-		Net Margin		-		Net Profit Margin		-		Net Profit Ratio
	 */
	@Override
	protected String getNetMargin_XPath() {
		String	NET_MARGIN_XPATH	=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[6]/td[6]/span";
		return NET_MARGIN_XPATH;
	}
	
	/**
	 * EBIT / Ativo
	 * 
	 * EBIT dividido por Ativos totais
	 */
	@Override
	protected String getEbitOverAsset_XPath() {
		String	EBIT_OVER_ASSET_XPATH	=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[7]/td[6]/span";
		return	EBIT_OVER_ASSET_XPATH;
	}
	
	/**
	 * Return over Invested Capital
	 * 
	 * Retorno sobre o Capital Investido: Calculado dividindo-se o EBIT por (Ativos - Fornecedores - Caixa). Informa o retorno que a empresa consegue sobre o capital total aplicado.
	 */
	@Override
	protected String getReturnOverInvestedCapital_XPath() {
		String	RETURN_OVER_INVESTED_CAPITAL_XPATH	=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[8]/td[6]/span";
		return RETURN_OVER_INVESTED_CAPITAL_XPATH;
	}
	
	/**
	 * ROE - Return on Equity
	 * 
	 * Retorno sobre o Patrimônio Líquido: Lucro líquido dividido pelo Patrimônio Líquido
	 */
	@Override
	protected String getReturnOverEquity_XPath() {
		String	RETURN_ON_EQUITY_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[9]/td[6]/span";
		return RETURN_ON_EQUITY_XPATH;
	}
	
	/**
	 * Liquidez Corrente
	 * 
	 * Ativo Circulante dividido pelo Passivo Circulante: Reflete a capacidade de pagamento da empresa no curto prazo.
	 * 
	 *  Current Liquity		-		Current Ratio		-		Liquidity Ratio
	 */
	@Override
	protected String getCurrentLiquidity_XPath() {
		String	CURRENT_LIQUIDITY_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[10]/td[6]/span";
		return CURRENT_LIQUIDITY_XPATH;
	}
	
	/**
	 * Dívida Bruta sobre Patrimônio Líquido
	 * 
	 * Dívida Bruta total (Dívida+Debêntures) dividido pelo Patrimônio Líquido
	 * 
	 * Debt to Equity Ratio
	 */
	@Override
	protected String getGrossDebtOverEquity_XPath() {
		String	GROSS_DEBT_OVER_EQUITY_XPATH	=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[11]/td[6]/span";
		return GROSS_DEBT_OVER_EQUITY_XPATH;
	}
	
}