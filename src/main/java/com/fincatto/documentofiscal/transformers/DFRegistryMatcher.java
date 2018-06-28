package com.fincatto.documentofiscal.transformers;

import com.fincatto.documentofiscal.DFAmbiente;
import com.fincatto.documentofiscal.DFModelo;
import com.fincatto.documentofiscal.DFPais;
import com.fincatto.documentofiscal.DFUnidadeFederativa;
import com.fincatto.documentofiscal.cte200.classes.*;
import com.fincatto.documentofiscal.cte200.transformers.*;
import com.fincatto.documentofiscal.mdfe3.classes.def.*;
import com.fincatto.documentofiscal.mdfe3.transformers.*;
import com.fincatto.documentofiscal.nfe.NFTipoEmissao;
import com.fincatto.documentofiscal.nfe.transformers.NFTipoEmissaoTransformer;
import com.fincatto.documentofiscal.nfe310.classes.NFFormaPagamentoPrazo;
import com.fincatto.documentofiscal.nfe310.classes.nota.NFFormaPagamentoMoeda;
import com.fincatto.documentofiscal.nfe310.transformers.NFFormaPagamentoMoedaTransformer;
import com.fincatto.documentofiscal.nfe310.transformers.NFFormaPagamentoTransformer;
import com.fincatto.documentofiscal.nfe400.classes.*;
import com.fincatto.documentofiscal.nfe400.classes.cadastro.NFIndicadorContribuinteCTe;
import com.fincatto.documentofiscal.nfe400.classes.cadastro.NFIndicadorContribuinteNFe;
import com.fincatto.documentofiscal.nfe400.classes.cadastro.NFSituacaoContribuinte;
import com.fincatto.documentofiscal.nfe400.classes.lote.envio.NFLoteIndicadorProcessamento;
import com.fincatto.documentofiscal.nfe400.classes.nota.*;
import com.fincatto.documentofiscal.nfe400.transformers.*;
import org.simpleframework.xml.transform.RegistryMatcher;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class DFRegistryMatcher extends RegistryMatcher {

    public DFRegistryMatcher() {
        super.bind(DFModelo.class, new DFModeloTransformer());
        super.bind(DFAmbiente.class, new DFAmbienteTransformer());
        super.bind(LocalDate.class, new DFLocalDateTransformer());
        super.bind(LocalTime.class, new DFLocalTimeTransformer());
        super.bind(ZonedDateTime.class, new DFDateTimeTransformer());
        super.bind(LocalDateTime.class, new DFLocalDateTimeTransformer());
        super.bind(DFUnidadeFederativa.class, new DFUnidadeFederativaTransformer());
        super.bind(NFTipoEmissao.class, new NFTipoEmissaoTransformer());
        super.bind(DFPais.class, new DFPaisTransformer());

        // NFE 3.10
        super.bind(NFTipo.class, new NFTipoTransformer());
        super.bind(NFOrigem.class, new NFOrigemTransformer());
        super.bind(NFFinalidade.class, new NFFinalidadeTransformer());
        super.bind(NFTipoImpressao.class, new NFTipoImpressaoTransformer());
        super.bind(NFOrigemProcesso.class, new NFOrigemProcessoTransformer());
        super.bind(NFOperadoraCartao.class, new NFOperadoraCartaoTransformer());
        super.bind(NFProcessoEmissor.class, new NFProgramaEmissorTransformer());
        super.bind(NFModalidadeFrete.class, new NFModalidadeFreteTransformer());
        super.bind(NFRegimeTributario.class, new NFRegimeTributarioTransformer());
        super.bind(NFFormaPagamentoPrazo.class, new NFFormaPagamentoTransformer());
        super.bind(NFNotaInfoVeiculoCor.class, new NFNotaInfoVeiculoCorTransformer());
        super.bind(NFFormaPagamentoMoeda.class, new NFFormaPagamentoMoedaTransformer());
        super.bind(NFNotaInfoTipoVeiculo.class, new NFNotaInfoTipoVeiculoTransformer());
        super.bind(NFSituacaoContribuinte.class, new NFSituacaoContribuinteTransformer());
        super.bind(NFNotaInfoEspecieVeiculo.class, new NFNotaInfoEspecieVeiculoTransformer());
        super.bind(NFProdutoCompoeValorNota.class, new NFProdutoCompoeValorNotaTransformer());
        super.bind(NFTipoIntegracaoPagamento.class, new NFTipoIntegracaoPagamentoTransformer());
        super.bind(NFIndicadorIEDestinatario.class, new NFIndicadorIEDestinatarioTransformer());
        super.bind(NFOperacaoConsumidorFinal.class, new NFOperacaoConsumidorFinalTransformer());
        super.bind(NFNotaInfoCombustivelTipo.class, new NFNotaInfoCombustivelTipoTransformer());
        super.bind(NFIndicadorContribuinteCTe.class, new NFIndicadorContribuinteCTTransformer());
        super.bind(NFIndicadorContribuinteNFe.class, new NFIndicadorContribuinteNFeTransformer());
        super.bind(NFNotaMotivoDesoneracaoICMS.class, new NFNotaMotivoDesoneracaoICMSTransformer());
        super.bind(NFLoteIndicadorProcessamento.class, new NFLoteIndicadorProcessamentoTransformer());
        super.bind(NFViaTransporteInternacional.class, new NFViaTransporteInternacionalTransformer());
        super.bind(NFIndicadorPresencaComprador.class, new NFIndicadorPresencaCompradorTransformer());
        super.bind(NFFormaImportacaoIntermediacao.class, new NFFormaImportacaoIntermediacaoTransformer());
        super.bind(NFNotaInfoImpostoTributacaoICMS.class, new NFNotaInfoImpostoTributacaoICMSTransformer());
        super.bind(NFNotaInfoSituacaoTributariaIPI.class, new NFNotaInfoSituacaoTributariaIPITransformer());
        super.bind(NFNotaInfoSituacaoTributariaPIS.class, new NFNotaInfoSituacaoTributariaPISTransformer());
        super.bind(NFNotaInfoItemModalidadeBCICMSST.class, new NFnotaInfoItemModalidadeBCICMSSTTransformer());
        super.bind(NFNotaInfoRegimeEspecialTributacao.class, new NFNotaInfoRegimeEspecialTributacaoTransformer());
        super.bind(NFNotaInfoSituacaoTributariaCOFINS.class, new NFNotaInfoSituacaoTributariaCOFINSTransformer());
        super.bind(NFNotaInfoItemProdutoArmamentoTipo.class, new NFNotaInfoItemProdutoArmamentoTipoTransformer());
        super.bind(NFIdentificadorLocalDestinoOperacao.class, new NFIdentificadorLocalDestinoOperacaoTransformer());
        super.bind(NFNotaInfoItemProdutoVeiculoCondicao.class, new NFNotaInfoItemProdutoVeiculoCondicaoTransformer());
        super.bind(NFNotaInfoItemProdutoVeiculoRestricao.class, new NFNotaInfoItemProdutoVeiculoRestricaoTransformer());
        super.bind(NFNotaInfoItemIndicadorIncentivoFiscal.class, new NFNotaInfoItemIndicadorIncentivoFiscalTransformer());
        super.bind(NFNotaInfoItemIndicadorExigibilidadeISS.class, new NFNotaInfoItemIndicadorExigibilidadeISSTransformer());
        super.bind(NFNotaSituacaoOperacionalSimplesNacional.class, new NFNotaSituacaoOperacionalSimplesNacionalTransformer());
        super.bind(NFNotaInfoItemProdutoVeiculoTipoOperacao.class, new NFNotaInfoItemProdutoVeiculoTipoOperacaoTransformer());
        super.bind(NFNotaInfoItemProdutoVeiculoCondicaoChassi.class, new NFNotaInfoItemProdutoVeiculoCondicaoChassiTransformer());
        super.bind(NFNotaInfoItemModalidadeBCICMS.class, new NFNotaInfoItemModalidadeBCICMSTransformer());

        // NFE 4.00
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFTipo.class, new com.fincatto.documentofiscal.nfe400.transformers.NFTipoTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFOrigem.class, new com.fincatto.documentofiscal.nfe400.transformers.NFOrigemTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFFinalidade.class, new com.fincatto.documentofiscal.nfe400.transformers.NFFinalidadeTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFTipoImpressao.class, new com.fincatto.documentofiscal.nfe400.transformers.NFTipoImpressaoTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFOrigemProcesso.class, new com.fincatto.documentofiscal.nfe400.transformers.NFOrigemProcessoTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.nota.NFOperadoraCartao.class, new com.fincatto.documentofiscal.nfe400.transformers.NFOperadoraCartaoTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFProcessoEmissor.class, new com.fincatto.documentofiscal.nfe400.transformers.NFProgramaEmissorTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFModalidadeFrete.class, new com.fincatto.documentofiscal.nfe400.transformers.NFModalidadeFreteTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFRegimeTributario.class, new com.fincatto.documentofiscal.nfe400.transformers.NFRegimeTributarioTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoVeiculoCor.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoVeiculoCorTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.nota.NFMeioPagamento.class, new com.fincatto.documentofiscal.nfe400.transformers.NFMeioPagamentoTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFIndicadorFormaPagamento.class, new com.fincatto.documentofiscal.nfe400.transformers.NFIndicadorFormaPagamentoTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoTipoVeiculo.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoTipoVeiculoTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.cadastro.NFSituacaoContribuinte.class, new com.fincatto.documentofiscal.nfe400.transformers.NFSituacaoContribuinteTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoEspecieVeiculo.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoEspecieVeiculoTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFProdutoCompoeValorNota.class, new com.fincatto.documentofiscal.nfe400.transformers.NFProdutoCompoeValorNotaTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.nota.NFTipoIntegracaoPagamento.class, new com.fincatto.documentofiscal.nfe400.transformers.NFTipoIntegracaoPagamentoTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.nota.NFIndicadorIEDestinatario.class, new com.fincatto.documentofiscal.nfe400.transformers.NFIndicadorIEDestinatarioTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.nota.NFOperacaoConsumidorFinal.class, new com.fincatto.documentofiscal.nfe400.transformers.NFOperacaoConsumidorFinalTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoCombustivelTipo.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoCombustivelTipoTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.cadastro.NFIndicadorContribuinteCTe.class, new com.fincatto.documentofiscal.nfe400.transformers.NFIndicadorContribuinteCTTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.cadastro.NFIndicadorContribuinteNFe.class, new com.fincatto.documentofiscal.nfe400.transformers.NFIndicadorContribuinteNFeTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFNotaMotivoDesoneracaoICMS.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaMotivoDesoneracaoICMSTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.lote.envio.NFLoteIndicadorProcessamento.class, new com.fincatto.documentofiscal.nfe400.transformers.NFLoteIndicadorProcessamentoTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.nota.NFViaTransporteInternacional.class, new com.fincatto.documentofiscal.nfe400.transformers.NFViaTransporteInternacionalTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.nota.NFIndicadorPresencaComprador.class, new com.fincatto.documentofiscal.nfe400.transformers.NFIndicadorPresencaCompradorTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.nota.NFFormaImportacaoIntermediacao.class, new com.fincatto.documentofiscal.nfe400.transformers.NFFormaImportacaoIntermediacaoTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.nota.NFIndicadorEscalaRelevante.class, new com.fincatto.documentofiscal.nfe400.transformers.NFIndicadorEscalaRelevanteTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoImpostoTributacaoICMS.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoImpostoTributacaoICMSTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoSituacaoTributariaIPI.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoSituacaoTributariaIPITransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoSituacaoTributariaPIS.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoSituacaoTributariaPISTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoItemModalidadeBCICMSST.class, new com.fincatto.documentofiscal.nfe400.transformers.NFnotaInfoItemModalidadeBCICMSSTTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.nota.NFNotaInfoRegimeEspecialTributacao.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoRegimeEspecialTributacaoTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoSituacaoTributariaCOFINS.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoSituacaoTributariaCOFINSTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoItemProdutoArmamentoTipo.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoItemProdutoArmamentoTipoTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.nota.NFIdentificadorLocalDestinoOperacao.class, new com.fincatto.documentofiscal.nfe400.transformers.NFIdentificadorLocalDestinoOperacaoTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoItemProdutoVeiculoCondicao.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoItemProdutoVeiculoCondicaoTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoItemProdutoVeiculoRestricao.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoItemProdutoVeiculoRestricaoTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.nota.NFNotaInfoItemIndicadorIncentivoFiscal.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoItemIndicadorIncentivoFiscalTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.nota.NFNotaInfoItemIndicadorExigibilidadeISS.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoItemIndicadorExigibilidadeISSTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFNotaSituacaoOperacionalSimplesNacional.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaSituacaoOperacionalSimplesNacionalTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoItemProdutoVeiculoTipoOperacao.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoItemProdutoVeiculoTipoOperacaoTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoItemProdutoVeiculoCondicaoChassi.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoItemProdutoVeiculoCondicaoChassiTransformer());
        super.bind(com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoItemModalidadeBCICMS.class, new com.fincatto.documentofiscal.nfe400.transformers.NFNotaInfoItemModalidadeBCICMSTransformer());

        // CTe
        super.bind(CTModal.class, new CTModalTransformer());
        super.bind(CTTipoCte.class, new CTTipoCteTransformer());
        super.bind(CTTipoServico.class, new CTTipoServicoTransformer());
        super.bind(CTTipoEmissao.class, new CTTipoEmissaoTransformer());
        super.bind(CTUnidadeMedida.class, new CTUnidadeMedidaTransformer());
        super.bind(CTTipoImpressao.class, new CTTipoImpressaoTransformer());
        super.bind(CTFormaPagamento.class, new CTFormaPagamentoTransformer());
        super.bind(CTTomadorServico.class, new CTTomadorServicoTransformer());
        super.bind(CTTipoEntregaData.class, new CTTipoEntregaDataTransformer());
        super.bind(CTRetiraMercadoria.class, new CTRetiraMercadoriaTransformer());
        super.bind(CTTipoUnidadeCarga.class, new CTTipoUnidadeCargaTransformer());
        super.bind(CTResponsavelSeguro.class, new CTResponsavelSeguroTransformer());
        super.bind(CTTipoDocumentoOutro.class, new CTTipoDocumentoOutroTransformer());
        super.bind(CTTipoEntregaHorario.class, new CTTipoEntregaHorarioTransformer());
        super.bind(CTIdentificadorEmissor.class, new CTIdentificadorEmissorTransformer());
        super.bind(CTTipoUnidadeTransporte.class, new CTTipoUnidadeTransporteTransformer());
        super.bind(CTTipoDocumentoTransporteAnterior.class, new CTTipoDocumentoTransporteAnteriorTransformer());

        // CTe 300
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTTipoEmissao.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoEmissaoTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTFinalidade.class, new com.fincatto.documentofiscal.cte300.transformes.CTFinalidadeTransformes());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTProcessoEmissao.class, new com.fincatto.documentofiscal.cte300.transformes.CTProcessoEmissaoTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTModal.class, new com.fincatto.documentofiscal.cte300.transformes.CTModalTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTTipoServico.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoServicoTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTRetirada.class, new com.fincatto.documentofiscal.cte300.transformes.CTRetiradaTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTIndicadorTomador.class, new com.fincatto.documentofiscal.cte300.transformes.CTIndicadorTomadorTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTTipoImpressao.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoImpressaoTransformes());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTTomadorServico.class, new com.fincatto.documentofiscal.cte300.transformes.CTTomadorServicoTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTTipoPrazoDataEntrega.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoPrazoDataEntregaTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTTipoPrazoHoraEntrega.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoPrazoHoraEntregaTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTUnidadeMedida.class, new com.fincatto.documentofiscal.cte300.transformes.CTUnidadeMedidaTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTModeloNF.class, new com.fincatto.documentofiscal.cte300.transformes.CTModeloNFTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTTipoUnidadeCarga.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoUnidadeCargaTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTTipoUnidadeTransporte.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoUnidadeTransporteTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTTipoDocumento.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoDocumentoTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTTipoDocumentoTransporteAnterior.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoDocumentoTransporteAnteriorTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTCodigoSituacaoTributariaICMS.class, new com.fincatto.documentofiscal.cte300.transformes.CTCodigoSituacaoTributariaICMSTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTInformacoesManuseio.class, new com.fincatto.documentofiscal.cte300.transformes.CTInformacoesManuseioTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTClasseTarifa.class, new com.fincatto.documentofiscal.cte300.transformes.CTClasseTarifaTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTUnidadeMedidaProdPerigosos.class, new com.fincatto.documentofiscal.cte300.transformes.CTUnidadeMedidaProdPerigososTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTTipoDirecao.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoDirecaoTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTTipoTrafego.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoTrafegoTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTTipoFerrovia.class, new com.fincatto.documentofiscal.cte300.transformes.CTTipoFerroviaTransformer());
        super.bind(com.fincatto.documentofiscal.cte300.classes.CTIndicadoNegociavel.class, new com.fincatto.documentofiscal.cte300.transformes.CTIndicadoNegociavelTransformer());

        // MDF-e
        super.bind(MDFModalidadeTransporte.class, new MDFModalidadeTransporteTransformer());
        super.bind(MDFProcessoEmissao.class, new MDFProcessoEmissaoTransformer());
        super.bind(MDFTipoCarroceria.class, new MDFTipoCarroceriaTransformer());
        super.bind(MDFTipoEmissao.class, new MDFTipoEmissaoTransformer());
        super.bind(MDFTipoEmitente.class, new MDFTipoEmitenteTransformer());
        super.bind(MDFTipoProprietario.class, new MDFTipoProprietarioTransformer());
        super.bind(MDFTipoRodado.class, new MDFTipoRodadoTransformer());
        super.bind(MDFTipoTranportador.class, new MDFTipoTranportadorTransformer());
        super.bind(MDFTipoUnidadeCarga.class, new MDFTipoUnidadeCargaTransformer());
        super.bind(MDFTipoUnidadeTransporte.class, new MDFTipoUnidadeTransporteTransformer());
        super.bind(MDFUnidadeMedidaPesoBrutoCarga.class, new MDFUnidadeMedidaPesoBrutoCargaTransformer());
        super.bind(MDFTipoResponsavelSeguro.class, new MDFTipoResponsavelSeguroTransformer());

    }
}