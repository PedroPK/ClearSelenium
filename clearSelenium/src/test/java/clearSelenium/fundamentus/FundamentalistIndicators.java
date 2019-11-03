package clearSelenium.fundamentus;

public class FundamentalistIndicators {
	
	
	
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
	public static final String PRICE_OVER_PROFIT_RATIO_XPATH			=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[2]/td[4]/span";
	
	/**
	 * Preço sobre Valor Patrimonial
	 * 
	 * Preço da ação dividido pelo Valor Patrimonial por ação. 
	 * Informa quanto o mercado está disposto a pagar sobre o Patrimônio Líquido da empresa
	 */
	public static final String PRICE_OVER_BOOK_VALUE_RATIO_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[3]/td[4]/span";
	
	/**
	 * Preço sobre EBIT
	 * 
	 * Preço da ação dividido pelo EBIT por ação. EBIT é o Lucro antes dos Impostos e Despesas Financeiras. 
	 * É uma boa aproximação do lucro operacional da empresa.
	 */
	public static final String PRICE_OVER_EBIT_RATIO_XPATH				=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[4]/td[4]/span";
	
	/**
	 * Price Sales Ratio: Preço da ação dividido pela Receita Líquida por ação
	 */
	public static final String PRICE_SALES_RATIO_XPATH					=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[5]/td[4]/span";
	
	/**
	 * Preço sobre Ativos
	 * 
	 * Preço da ação dividido pelos Ativos totais por ação.
	 */
	public static final String PRICE_OVER_ASSETS_RATIO_XPATH			=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[6]/td[4]/span";
	
	/**
	 * Preço sobre Capital de Giro
	 * 
	 * Preço da ação dividido pelo capital de giro por ação. Capital de giro é o Ativo Circulante menos Passivo Circulante
	 */
	public static final String PRICE_OVER_WORKING_CAPITAL_RATIO_XPATH	=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[7]/td[4]/span";
	
	/**
	 * Preço sobre o Ativo Circulante Líquido
	 * 
	 * Preço da ação dividido pelos Ativos Circulantes Líquidos por ação. 
	 * Ativo Circ. Líq. é obtido subtraindo os ativos circulantes pelas dívidas de curto e longo prazo, ou seja, 
	 * após o pagamento de todas as dívidas, quanto sobraria dos ativos mais líquidos da empresa (caixa, estoque, etc)
	 */
	public static final String PRICE_OVER_NET_CURRENT_ASSET_RATIO_XPATH	=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[8]/td[4]/span";
	
	/**
	 * Dividend Yield
	 * 
	 * Dividendo pago por ação dividido pelo preço da ação. É o rendimento gerado para o dono da ação pelo pagamento de dividendos.
	 */
	public static final String DIVIDEND_YIELD_XPATH						=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[9]/td[4]/span";
	
	/**
	 * Valor da Firma (Enterprise Value dividido pelo EBIT.
	 */
	public static final String ENTERPRISE_VALUE_OVER_EBIT_RATIO_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[10]/td[4]/span";
	
	/**
	 * Giro do Ativo
	 * 
	 * Receita Líquida dividido por Ativos Totais. 
	 * Indica a eficiência com a qual a empresa usa seus ativos para gerar vendas
	 */
	public static final String ASSET_TURNOVER_XPATH						=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[11]/td[4]/span";
	
	/**
	 * Crescimento da Receita Líquida nos últimos 5 anos
	 */
	public static final String INCOME_GROWTH_LAST_5_YEARS_XPATH			=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[12]/td[4]/span";
	
	
	
	/************************************************************************/
	 
	 // Second Column
	
	/************************************************************************/
	
	
	/**
	 * Lucro por Ação
	 */
	public static final String PROFIT_PER_ACTION_XPATH						=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[2]/td[6]/span";
	
	/**
	 * Valor Patrimonial por Ação: Valor do Patrimônio Líquido dividido pelo número total de ações.
	 */
	public static final String BOOK_VALUE_OVER_STOCKS_XPATH				=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[3]/td[6]/span";
	
	/**
	 * Margem Bruta
	 * 
	 * Lucro Bruto dividido pela Receita Líquida: Indica a porcentagem de cada R$1 de venda que sobrou após o custo dos produtos/serviços vendidos
	 */
	public static final String GROSS_MARGIN_XPATH							=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[4]/td[6]/span";
	
	/**
	 * Margem EBIT
	 * 
	 * EBIT dividido pela Receita Líquida: 
	 * 		Indica a porcentagem de cada R$1 de venda que sobrou após o pagamento dos custos dos produtos/serviços vendidos, 
	 * 		das despesas com vendas, gerais e administrativas
	 * 
	 * Operational Margin		-		Operation income margin		-		Operating Profit Margin		-		Return of Sales (ROS)
	 */
	public static final String EBIT_MARGIN_XPATH							=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[5]/td[6]/span";
	
	/**
	 * Margem Líquida
	 * 
	 * Lucro Líquido dividido pela Receita Líquida
	 * 
	 * Profit Margin		-		Net Margin		-		Net Profit Margin		-		Net Profit Ratio
	 */
	public static final String NET_MARGIN_XPATH							=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[6]/td[6]/span";
	
	/**
	 * Return over Invested Capital
	 * 
	 * Retorno sobre o Capital Investido: Calculado dividindo-se o EBIT por (Ativos - Fornecedores - Caixa). Informa o retorno que a empresa consegue sobre o capital total aplicado.
	 */
	public static final String RETURN_OVER_INVESTED_CAPITAL_XPATH			=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[8]/td[6]/span";
	
	/**
	 * ROE - Return on Equity
	 * 
	 * Retorno sobre o Patrimônio Líquido: Lucro líquido dividido pelo Patrimônio Líquido
	 */
	public static final String RETURN_ON_EQUITY_XPATH						=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[9]/td[6]/span";
	
	/**
	 * Liquidez Corrente
	 * 
	 * Ativo Circulante dividido pelo Passivo Circulante: Reflete a capacidade de pagamento da empresa no curto prazo.
	 * 
	 *  Current Liquity		-		Current Ratio		-		Liquidity Ratio
	 */
	public static final String CURRENT_LIQUIDITY_XPATH						=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[10]/td[6]/span";
	
	/**
	 * Dívida Bruta sobre Patrimônio Líquido
	 * 
	 * Dívida Bruta total (Dívida+Debêntures) dividido pelo Patrimônio Líquido
	 * 
	 * Debt to Equity Ratio
	 */
	public static final String DEBT_TO_EQUITY_RATIO_XPATH					=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[11]/td[6]/span";
	
	
}