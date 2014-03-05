/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csus.csc191.models;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FXSSD
 */
@Entity
@Table(name = "mastercsv")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mastercsv.findAll", query = "SELECT m FROM Mastercsv m"),
    @NamedQuery(name = "Mastercsv.findByAColumn", query = "SELECT m FROM Mastercsv m WHERE m.aColumn = :aColumn"),
    @NamedQuery(name = "Mastercsv.findByBColumn", query = "SELECT m FROM Mastercsv m WHERE m.bColumn = :bColumn"),
    @NamedQuery(name = "Mastercsv.findByCColumn", query = "SELECT m FROM Mastercsv m WHERE m.cColumn = :cColumn"),
    @NamedQuery(name = "Mastercsv.findByDColumn", query = "SELECT m FROM Mastercsv m WHERE m.dColumn = :dColumn"),
    @NamedQuery(name = "Mastercsv.findByEColumn", query = "SELECT m FROM Mastercsv m WHERE m.eColumn = :eColumn"),
    @NamedQuery(name = "Mastercsv.findByFColumn", query = "SELECT m FROM Mastercsv m WHERE m.fColumn = :fColumn"),
    @NamedQuery(name = "Mastercsv.findByGColumn", query = "SELECT m FROM Mastercsv m WHERE m.gColumn = :gColumn"),
    @NamedQuery(name = "Mastercsv.findByHColumn", query = "SELECT m FROM Mastercsv m WHERE m.hColumn = :hColumn"),
    @NamedQuery(name = "Mastercsv.findByIColumn", query = "SELECT m FROM Mastercsv m WHERE m.iColumn = :iColumn"),
    @NamedQuery(name = "Mastercsv.findByJColumn", query = "SELECT m FROM Mastercsv m WHERE m.jColumn = :jColumn"),
    @NamedQuery(name = "Mastercsv.findByKColumn", query = "SELECT m FROM Mastercsv m WHERE m.kColumn = :kColumn"),
    @NamedQuery(name = "Mastercsv.findByLColumn", query = "SELECT m FROM Mastercsv m WHERE m.lColumn = :lColumn"),
    @NamedQuery(name = "Mastercsv.findByMColumn", query = "SELECT m FROM Mastercsv m WHERE m.mColumn = :mColumn"),
    @NamedQuery(name = "Mastercsv.findByNColumn", query = "SELECT m FROM Mastercsv m WHERE m.nColumn = :nColumn"),
    @NamedQuery(name = "Mastercsv.findByOColumn", query = "SELECT m FROM Mastercsv m WHERE m.oColumn = :oColumn"),
    @NamedQuery(name = "Mastercsv.findByPColumn", query = "SELECT m FROM Mastercsv m WHERE m.pColumn = :pColumn"),
    @NamedQuery(name = "Mastercsv.findByQColumn", query = "SELECT m FROM Mastercsv m WHERE m.qColumn = :qColumn"),
    @NamedQuery(name = "Mastercsv.findByRColumn", query = "SELECT m FROM Mastercsv m WHERE m.rColumn = :rColumn"),
    @NamedQuery(name = "Mastercsv.findBySColumn", query = "SELECT m FROM Mastercsv m WHERE m.sColumn = :sColumn"),
    @NamedQuery(name = "Mastercsv.findByTColumn", query = "SELECT m FROM Mastercsv m WHERE m.tColumn = :tColumn"),
    @NamedQuery(name = "Mastercsv.findByUColumn", query = "SELECT m FROM Mastercsv m WHERE m.uColumn = :uColumn"),
    @NamedQuery(name = "Mastercsv.findByVColumn", query = "SELECT m FROM Mastercsv m WHERE m.vColumn = :vColumn"),
    @NamedQuery(name = "Mastercsv.findByWColumn", query = "SELECT m FROM Mastercsv m WHERE m.wColumn = :wColumn"),
    @NamedQuery(name = "Mastercsv.findByXColumn", query = "SELECT m FROM Mastercsv m WHERE m.xColumn = :xColumn"),
    @NamedQuery(name = "Mastercsv.findByYColumn", query = "SELECT m FROM Mastercsv m WHERE m.yColumn = :yColumn"),
    @NamedQuery(name = "Mastercsv.findByZColumn", query = "SELECT m FROM Mastercsv m WHERE m.zColumn = :zColumn"),
    @NamedQuery(name = "Mastercsv.findByAaColumn", query = "SELECT m FROM Mastercsv m WHERE m.aaColumn = :aaColumn"),
    @NamedQuery(name = "Mastercsv.findByAbColumn", query = "SELECT m FROM Mastercsv m WHERE m.abColumn = :abColumn"),
    @NamedQuery(name = "Mastercsv.findByAcColumn", query = "SELECT m FROM Mastercsv m WHERE m.acColumn = :acColumn"),
    @NamedQuery(name = "Mastercsv.findByAdColumn", query = "SELECT m FROM Mastercsv m WHERE m.adColumn = :adColumn"),
    @NamedQuery(name = "Mastercsv.findByAeColumn", query = "SELECT m FROM Mastercsv m WHERE m.aeColumn = :aeColumn"),
    @NamedQuery(name = "Mastercsv.findByAfColumn", query = "SELECT m FROM Mastercsv m WHERE m.afColumn = :afColumn"),
    @NamedQuery(name = "Mastercsv.findByAgColumn", query = "SELECT m FROM Mastercsv m WHERE m.agColumn = :agColumn"),
    @NamedQuery(name = "Mastercsv.findByAhColumn", query = "SELECT m FROM Mastercsv m WHERE m.ahColumn = :ahColumn"),
    @NamedQuery(name = "Mastercsv.findByAiColumn", query = "SELECT m FROM Mastercsv m WHERE m.aiColumn = :aiColumn"),
    @NamedQuery(name = "Mastercsv.findByAjColumn", query = "SELECT m FROM Mastercsv m WHERE m.ajColumn = :ajColumn"),
    @NamedQuery(name = "Mastercsv.findByAkColumn", query = "SELECT m FROM Mastercsv m WHERE m.akColumn = :akColumn"),
    @NamedQuery(name = "Mastercsv.findByAlColumn", query = "SELECT m FROM Mastercsv m WHERE m.alColumn = :alColumn"),
    @NamedQuery(name = "Mastercsv.findByAmColumn", query = "SELECT m FROM Mastercsv m WHERE m.amColumn = :amColumn"),
    @NamedQuery(name = "Mastercsv.findByAnColumn", query = "SELECT m FROM Mastercsv m WHERE m.anColumn = :anColumn"),
    @NamedQuery(name = "Mastercsv.findByAoColumn", query = "SELECT m FROM Mastercsv m WHERE m.aoColumn = :aoColumn"),
    @NamedQuery(name = "Mastercsv.findByApColumn", query = "SELECT m FROM Mastercsv m WHERE m.apColumn = :apColumn"),
    @NamedQuery(name = "Mastercsv.findByAqColumn", query = "SELECT m FROM Mastercsv m WHERE m.aqColumn = :aqColumn"),
    @NamedQuery(name = "Mastercsv.findByArColumn", query = "SELECT m FROM Mastercsv m WHERE m.arColumn = :arColumn"),
    @NamedQuery(name = "Mastercsv.findByAsColumn", query = "SELECT m FROM Mastercsv m WHERE m.asColumn = :asColumn"),
    @NamedQuery(name = "Mastercsv.findByAtColumn", query = "SELECT m FROM Mastercsv m WHERE m.atColumn = :atColumn"),
    @NamedQuery(name = "Mastercsv.findByAuColumn", query = "SELECT m FROM Mastercsv m WHERE m.auColumn = :auColumn"),
    @NamedQuery(name = "Mastercsv.findByAvColumn", query = "SELECT m FROM Mastercsv m WHERE m.avColumn = :avColumn"),
    @NamedQuery(name = "Mastercsv.findByAwColumn", query = "SELECT m FROM Mastercsv m WHERE m.awColumn = :awColumn"),
    @NamedQuery(name = "Mastercsv.findByAxColumn", query = "SELECT m FROM Mastercsv m WHERE m.axColumn = :axColumn"),
    @NamedQuery(name = "Mastercsv.findByAyColumn", query = "SELECT m FROM Mastercsv m WHERE m.ayColumn = :ayColumn"),
    @NamedQuery(name = "Mastercsv.findByAzColumn", query = "SELECT m FROM Mastercsv m WHERE m.azColumn = :azColumn"),
    @NamedQuery(name = "Mastercsv.findByBaColumn", query = "SELECT m FROM Mastercsv m WHERE m.baColumn = :baColumn"),
    @NamedQuery(name = "Mastercsv.findByBbColumn", query = "SELECT m FROM Mastercsv m WHERE m.bbColumn = :bbColumn"),
    @NamedQuery(name = "Mastercsv.findByBcColumn", query = "SELECT m FROM Mastercsv m WHERE m.bcColumn = :bcColumn"),
    @NamedQuery(name = "Mastercsv.findByBdColumn", query = "SELECT m FROM Mastercsv m WHERE m.bdColumn = :bdColumn"),
    @NamedQuery(name = "Mastercsv.findByBeColumn", query = "SELECT m FROM Mastercsv m WHERE m.beColumn = :beColumn"),
    @NamedQuery(name = "Mastercsv.findByBfColumn", query = "SELECT m FROM Mastercsv m WHERE m.bfColumn = :bfColumn"),
    @NamedQuery(name = "Mastercsv.findByBgColumn", query = "SELECT m FROM Mastercsv m WHERE m.bgColumn = :bgColumn"),
    @NamedQuery(name = "Mastercsv.findByBhColumn", query = "SELECT m FROM Mastercsv m WHERE m.bhColumn = :bhColumn"),
    @NamedQuery(name = "Mastercsv.findByBiColumn", query = "SELECT m FROM Mastercsv m WHERE m.biColumn = :biColumn"),
    @NamedQuery(name = "Mastercsv.findByBjColumn", query = "SELECT m FROM Mastercsv m WHERE m.bjColumn = :bjColumn"),
    @NamedQuery(name = "Mastercsv.findByBkColumn", query = "SELECT m FROM Mastercsv m WHERE m.bkColumn = :bkColumn"),
    @NamedQuery(name = "Mastercsv.findByBlColumn", query = "SELECT m FROM Mastercsv m WHERE m.blColumn = :blColumn"),
    @NamedQuery(name = "Mastercsv.findByBmColumn", query = "SELECT m FROM Mastercsv m WHERE m.bmColumn = :bmColumn"),
    @NamedQuery(name = "Mastercsv.findByBnColumn", query = "SELECT m FROM Mastercsv m WHERE m.bnColumn = :bnColumn"),
    @NamedQuery(name = "Mastercsv.findByBoColumn", query = "SELECT m FROM Mastercsv m WHERE m.boColumn = :boColumn"),
    @NamedQuery(name = "Mastercsv.findByBpColumn", query = "SELECT m FROM Mastercsv m WHERE m.bpColumn = :bpColumn"),
    @NamedQuery(name = "Mastercsv.findByBqColumn", query = "SELECT m FROM Mastercsv m WHERE m.bqColumn = :bqColumn"),
    @NamedQuery(name = "Mastercsv.findByBrColumn", query = "SELECT m FROM Mastercsv m WHERE m.brColumn = :brColumn"),
    @NamedQuery(name = "Mastercsv.findByBsColumn", query = "SELECT m FROM Mastercsv m WHERE m.bsColumn = :bsColumn"),
    @NamedQuery(name = "Mastercsv.findByBtColumn", query = "SELECT m FROM Mastercsv m WHERE m.btColumn = :btColumn"),
    @NamedQuery(name = "Mastercsv.findByBuColumn", query = "SELECT m FROM Mastercsv m WHERE m.buColumn = :buColumn"),
    @NamedQuery(name = "Mastercsv.findByBvColumn", query = "SELECT m FROM Mastercsv m WHERE m.bvColumn = :bvColumn"),
    @NamedQuery(name = "Mastercsv.findByBwColumn", query = "SELECT m FROM Mastercsv m WHERE m.bwColumn = :bwColumn"),
    @NamedQuery(name = "Mastercsv.findByBxColumn", query = "SELECT m FROM Mastercsv m WHERE m.bxColumn = :bxColumn"),
    @NamedQuery(name = "Mastercsv.findByByColumn", query = "SELECT m FROM Mastercsv m WHERE m.byColumn = :byColumn"),
    @NamedQuery(name = "Mastercsv.findByBzColumn", query = "SELECT m FROM Mastercsv m WHERE m.bzColumn = :bzColumn"),
    @NamedQuery(name = "Mastercsv.findByCaColumn", query = "SELECT m FROM Mastercsv m WHERE m.caColumn = :caColumn"),
    @NamedQuery(name = "Mastercsv.findByCbColumn", query = "SELECT m FROM Mastercsv m WHERE m.cbColumn = :cbColumn"),
    @NamedQuery(name = "Mastercsv.findByCcColumn", query = "SELECT m FROM Mastercsv m WHERE m.ccColumn = :ccColumn"),
    @NamedQuery(name = "Mastercsv.findByCdColumn", query = "SELECT m FROM Mastercsv m WHERE m.cdColumn = :cdColumn"),
    @NamedQuery(name = "Mastercsv.findByCeColumn", query = "SELECT m FROM Mastercsv m WHERE m.ceColumn = :ceColumn"),
    @NamedQuery(name = "Mastercsv.findByCfColumn", query = "SELECT m FROM Mastercsv m WHERE m.cfColumn = :cfColumn"),
    @NamedQuery(name = "Mastercsv.findByCgColumn", query = "SELECT m FROM Mastercsv m WHERE m.cgColumn = :cgColumn"),
    @NamedQuery(name = "Mastercsv.findByChColumn", query = "SELECT m FROM Mastercsv m WHERE m.chColumn = :chColumn"),
    @NamedQuery(name = "Mastercsv.findByCiColumn", query = "SELECT m FROM Mastercsv m WHERE m.ciColumn = :ciColumn"),
    @NamedQuery(name = "Mastercsv.findByCjColumn", query = "SELECT m FROM Mastercsv m WHERE m.cjColumn = :cjColumn"),
    @NamedQuery(name = "Mastercsv.findByCkColumn", query = "SELECT m FROM Mastercsv m WHERE m.ckColumn = :ckColumn"),
    @NamedQuery(name = "Mastercsv.findByClColumn", query = "SELECT m FROM Mastercsv m WHERE m.clColumn = :clColumn"),
    @NamedQuery(name = "Mastercsv.findByCmColumn", query = "SELECT m FROM Mastercsv m WHERE m.cmColumn = :cmColumn"),
    @NamedQuery(name = "Mastercsv.findByCnColumn", query = "SELECT m FROM Mastercsv m WHERE m.cnColumn = :cnColumn"),
    @NamedQuery(name = "Mastercsv.findByCoColumn", query = "SELECT m FROM Mastercsv m WHERE m.coColumn = :coColumn"),
    @NamedQuery(name = "Mastercsv.findByCpColumn", query = "SELECT m FROM Mastercsv m WHERE m.cpColumn = :cpColumn"),
    @NamedQuery(name = "Mastercsv.findByCqColumn", query = "SELECT m FROM Mastercsv m WHERE m.cqColumn = :cqColumn"),
    @NamedQuery(name = "Mastercsv.findByCrColumn", query = "SELECT m FROM Mastercsv m WHERE m.crColumn = :crColumn"),
    @NamedQuery(name = "Mastercsv.findByCsColumn", query = "SELECT m FROM Mastercsv m WHERE m.csColumn = :csColumn"),
    @NamedQuery(name = "Mastercsv.findByCtColumn", query = "SELECT m FROM Mastercsv m WHERE m.ctColumn = :ctColumn"),
    @NamedQuery(name = "Mastercsv.findByCuColumn", query = "SELECT m FROM Mastercsv m WHERE m.cuColumn = :cuColumn"),
    @NamedQuery(name = "Mastercsv.findByCvColumn", query = "SELECT m FROM Mastercsv m WHERE m.cvColumn = :cvColumn"),
    @NamedQuery(name = "Mastercsv.findByCwColumn", query = "SELECT m FROM Mastercsv m WHERE m.cwColumn = :cwColumn"),
    @NamedQuery(name = "Mastercsv.findByCxColumn", query = "SELECT m FROM Mastercsv m WHERE m.cxColumn = :cxColumn"),
    @NamedQuery(name = "Mastercsv.findByCyColumn", query = "SELECT m FROM Mastercsv m WHERE m.cyColumn = :cyColumn"),
    @NamedQuery(name = "Mastercsv.findByCzColumn", query = "SELECT m FROM Mastercsv m WHERE m.czColumn = :czColumn"),
    @NamedQuery(name = "Mastercsv.findByDaColumn", query = "SELECT m FROM Mastercsv m WHERE m.daColumn = :daColumn"),
    @NamedQuery(name = "Mastercsv.findByDbColumn", query = "SELECT m FROM Mastercsv m WHERE m.dbColumn = :dbColumn"),
    @NamedQuery(name = "Mastercsv.findByDcColumn", query = "SELECT m FROM Mastercsv m WHERE m.dcColumn = :dcColumn"),
    @NamedQuery(name = "Mastercsv.findByDdColumn", query = "SELECT m FROM Mastercsv m WHERE m.ddColumn = :ddColumn"),
    @NamedQuery(name = "Mastercsv.findByDeColumn", query = "SELECT m FROM Mastercsv m WHERE m.deColumn = :deColumn"),
    @NamedQuery(name = "Mastercsv.findByDfColumn", query = "SELECT m FROM Mastercsv m WHERE m.dfColumn = :dfColumn"),
    @NamedQuery(name = "Mastercsv.findByDgColumn", query = "SELECT m FROM Mastercsv m WHERE m.dgColumn = :dgColumn"),
    @NamedQuery(name = "Mastercsv.findByDhColumn", query = "SELECT m FROM Mastercsv m WHERE m.dhColumn = :dhColumn"),
    @NamedQuery(name = "Mastercsv.findByDiColumn", query = "SELECT m FROM Mastercsv m WHERE m.diColumn = :diColumn"),
    @NamedQuery(name = "Mastercsv.findByDjColumn", query = "SELECT m FROM Mastercsv m WHERE m.djColumn = :djColumn"),
    @NamedQuery(name = "Mastercsv.findByDkColumn", query = "SELECT m FROM Mastercsv m WHERE m.dkColumn = :dkColumn"),
    @NamedQuery(name = "Mastercsv.findByDlColumn", query = "SELECT m FROM Mastercsv m WHERE m.dlColumn = :dlColumn"),
    @NamedQuery(name = "Mastercsv.findByDmColumn", query = "SELECT m FROM Mastercsv m WHERE m.dmColumn = :dmColumn"),
    @NamedQuery(name = "Mastercsv.findByDnColumn", query = "SELECT m FROM Mastercsv m WHERE m.dnColumn = :dnColumn"),
    @NamedQuery(name = "Mastercsv.findByDoColumn", query = "SELECT m FROM Mastercsv m WHERE m.doColumn = :doColumn"),
    @NamedQuery(name = "Mastercsv.findByDpColumn", query = "SELECT m FROM Mastercsv m WHERE m.dpColumn = :dpColumn"),
    @NamedQuery(name = "Mastercsv.findByDqColumn", query = "SELECT m FROM Mastercsv m WHERE m.dqColumn = :dqColumn"),
    @NamedQuery(name = "Mastercsv.findByDrColumn", query = "SELECT m FROM Mastercsv m WHERE m.drColumn = :drColumn"),
    @NamedQuery(name = "Mastercsv.findByDsColumn", query = "SELECT m FROM Mastercsv m WHERE m.dsColumn = :dsColumn"),
    @NamedQuery(name = "Mastercsv.findByDtColumn", query = "SELECT m FROM Mastercsv m WHERE m.dtColumn = :dtColumn"),
    @NamedQuery(name = "Mastercsv.findByDuColumn", query = "SELECT m FROM Mastercsv m WHERE m.duColumn = :duColumn"),
    @NamedQuery(name = "Mastercsv.findByDvColumn", query = "SELECT m FROM Mastercsv m WHERE m.dvColumn = :dvColumn"),
    @NamedQuery(name = "Mastercsv.findByDwColumn", query = "SELECT m FROM Mastercsv m WHERE m.dwColumn = :dwColumn"),
    @NamedQuery(name = "Mastercsv.findByDxColumn", query = "SELECT m FROM Mastercsv m WHERE m.dxColumn = :dxColumn"),
    @NamedQuery(name = "Mastercsv.findByDyColumn", query = "SELECT m FROM Mastercsv m WHERE m.dyColumn = :dyColumn"),
    @NamedQuery(name = "Mastercsv.findByDzColumn", query = "SELECT m FROM Mastercsv m WHERE m.dzColumn = :dzColumn"),
    @NamedQuery(name = "Mastercsv.findByEaColumn", query = "SELECT m FROM Mastercsv m WHERE m.eaColumn = :eaColumn"),
    @NamedQuery(name = "Mastercsv.findByEbColumn", query = "SELECT m FROM Mastercsv m WHERE m.ebColumn = :ebColumn"),
    @NamedQuery(name = "Mastercsv.findByEcColumn", query = "SELECT m FROM Mastercsv m WHERE m.ecColumn = :ecColumn"),
    @NamedQuery(name = "Mastercsv.findByEdColumn", query = "SELECT m FROM Mastercsv m WHERE m.edColumn = :edColumn"),
    @NamedQuery(name = "Mastercsv.findByEeColumn", query = "SELECT m FROM Mastercsv m WHERE m.eeColumn = :eeColumn"),
    @NamedQuery(name = "Mastercsv.findByEfColumn", query = "SELECT m FROM Mastercsv m WHERE m.efColumn = :efColumn"),
    @NamedQuery(name = "Mastercsv.findByEgColumn", query = "SELECT m FROM Mastercsv m WHERE m.egColumn = :egColumn"),
    @NamedQuery(name = "Mastercsv.findByEhColumn", query = "SELECT m FROM Mastercsv m WHERE m.ehColumn = :ehColumn"),
    @NamedQuery(name = "Mastercsv.findByEiColumn", query = "SELECT m FROM Mastercsv m WHERE m.eiColumn = :eiColumn"),
    @NamedQuery(name = "Mastercsv.findByEjColumn", query = "SELECT m FROM Mastercsv m WHERE m.ejColumn = :ejColumn"),
    @NamedQuery(name = "Mastercsv.findByEkColumn", query = "SELECT m FROM Mastercsv m WHERE m.ekColumn = :ekColumn"),
    @NamedQuery(name = "Mastercsv.findByElColumn", query = "SELECT m FROM Mastercsv m WHERE m.elColumn = :elColumn"),
    @NamedQuery(name = "Mastercsv.findByEmColumn", query = "SELECT m FROM Mastercsv m WHERE m.emColumn = :emColumn"),
    @NamedQuery(name = "Mastercsv.findByEnColumn", query = "SELECT m FROM Mastercsv m WHERE m.enColumn = :enColumn"),
    @NamedQuery(name = "Mastercsv.findByEoColumn", query = "SELECT m FROM Mastercsv m WHERE m.eoColumn = :eoColumn"),
    @NamedQuery(name = "Mastercsv.findByEpColumn", query = "SELECT m FROM Mastercsv m WHERE m.epColumn = :epColumn"),
    @NamedQuery(name = "Mastercsv.findByEqColumn", query = "SELECT m FROM Mastercsv m WHERE m.eqColumn = :eqColumn"),
    @NamedQuery(name = "Mastercsv.findByErColumn", query = "SELECT m FROM Mastercsv m WHERE m.erColumn = :erColumn"),
    @NamedQuery(name = "Mastercsv.findByEsColumn", query = "SELECT m FROM Mastercsv m WHERE m.esColumn = :esColumn"),
    @NamedQuery(name = "Mastercsv.findByEtColumn", query = "SELECT m FROM Mastercsv m WHERE m.etColumn = :etColumn"),
    @NamedQuery(name = "Mastercsv.findByEuColumn", query = "SELECT m FROM Mastercsv m WHERE m.euColumn = :euColumn"),
    @NamedQuery(name = "Mastercsv.findByEvColumn", query = "SELECT m FROM Mastercsv m WHERE m.evColumn = :evColumn"),
    @NamedQuery(name = "Mastercsv.findByEwColumn", query = "SELECT m FROM Mastercsv m WHERE m.ewColumn = :ewColumn"),
    @NamedQuery(name = "Mastercsv.findByExColumn", query = "SELECT m FROM Mastercsv m WHERE m.exColumn = :exColumn"),
    @NamedQuery(name = "Mastercsv.findByEyColumn", query = "SELECT m FROM Mastercsv m WHERE m.eyColumn = :eyColumn"),
    @NamedQuery(name = "Mastercsv.findByEzColumn", query = "SELECT m FROM Mastercsv m WHERE m.ezColumn = :ezColumn"),
    @NamedQuery(name = "Mastercsv.findByFaColumn", query = "SELECT m FROM Mastercsv m WHERE m.faColumn = :faColumn"),
    @NamedQuery(name = "Mastercsv.findByFbColumn", query = "SELECT m FROM Mastercsv m WHERE m.fbColumn = :fbColumn"),
    @NamedQuery(name = "Mastercsv.findByFcColumn", query = "SELECT m FROM Mastercsv m WHERE m.fcColumn = :fcColumn"),
    @NamedQuery(name = "Mastercsv.findByFdColumn", query = "SELECT m FROM Mastercsv m WHERE m.fdColumn = :fdColumn"),
    @NamedQuery(name = "Mastercsv.findByFeColumn", query = "SELECT m FROM Mastercsv m WHERE m.feColumn = :feColumn"),
    @NamedQuery(name = "Mastercsv.findByFfColumn", query = "SELECT m FROM Mastercsv m WHERE m.ffColumn = :ffColumn"),
    @NamedQuery(name = "Mastercsv.findByFgColumn", query = "SELECT m FROM Mastercsv m WHERE m.fgColumn = :fgColumn"),
    @NamedQuery(name = "Mastercsv.findByFhColumn", query = "SELECT m FROM Mastercsv m WHERE m.fhColumn = :fhColumn"),
    @NamedQuery(name = "Mastercsv.findByFiColumn", query = "SELECT m FROM Mastercsv m WHERE m.fiColumn = :fiColumn"),
    @NamedQuery(name = "Mastercsv.findByFjColumn", query = "SELECT m FROM Mastercsv m WHERE m.fjColumn = :fjColumn"),
    @NamedQuery(name = "Mastercsv.findByFkColumn", query = "SELECT m FROM Mastercsv m WHERE m.fkColumn = :fkColumn"),
    @NamedQuery(name = "Mastercsv.findByFlColumn", query = "SELECT m FROM Mastercsv m WHERE m.flColumn = :flColumn"),
    @NamedQuery(name = "Mastercsv.findByFmColumn", query = "SELECT m FROM Mastercsv m WHERE m.fmColumn = :fmColumn"),
    @NamedQuery(name = "Mastercsv.findByFnColumn", query = "SELECT m FROM Mastercsv m WHERE m.fnColumn = :fnColumn"),
    @NamedQuery(name = "Mastercsv.findByFoColumn", query = "SELECT m FROM Mastercsv m WHERE m.foColumn = :foColumn"),
    @NamedQuery(name = "Mastercsv.findByFpColumn", query = "SELECT m FROM Mastercsv m WHERE m.fpColumn = :fpColumn"),
    @NamedQuery(name = "Mastercsv.findByFqColumn", query = "SELECT m FROM Mastercsv m WHERE m.fqColumn = :fqColumn"),
    @NamedQuery(name = "Mastercsv.findByFrColumn", query = "SELECT m FROM Mastercsv m WHERE m.frColumn = :frColumn"),
    @NamedQuery(name = "Mastercsv.findByFsColumn", query = "SELECT m FROM Mastercsv m WHERE m.fsColumn = :fsColumn"),
    @NamedQuery(name = "Mastercsv.findByFtColumn", query = "SELECT m FROM Mastercsv m WHERE m.ftColumn = :ftColumn"),
    @NamedQuery(name = "Mastercsv.findByFuColumn", query = "SELECT m FROM Mastercsv m WHERE m.fuColumn = :fuColumn"),
    @NamedQuery(name = "Mastercsv.findByFvColumn", query = "SELECT m FROM Mastercsv m WHERE m.fvColumn = :fvColumn"),
    @NamedQuery(name = "Mastercsv.findByFwColumn", query = "SELECT m FROM Mastercsv m WHERE m.fwColumn = :fwColumn"),
    @NamedQuery(name = "Mastercsv.findByFxColumn", query = "SELECT m FROM Mastercsv m WHERE m.fxColumn = :fxColumn"),
    @NamedQuery(name = "Mastercsv.findByFyColumn", query = "SELECT m FROM Mastercsv m WHERE m.fyColumn = :fyColumn"),
    @NamedQuery(name = "Mastercsv.findByFzColumn", query = "SELECT m FROM Mastercsv m WHERE m.fzColumn = :fzColumn"),
    @NamedQuery(name = "Mastercsv.findByGaColumn", query = "SELECT m FROM Mastercsv m WHERE m.gaColumn = :gaColumn"),
    @NamedQuery(name = "Mastercsv.findByGbColumn", query = "SELECT m FROM Mastercsv m WHERE m.gbColumn = :gbColumn"),
    @NamedQuery(name = "Mastercsv.findByGcColumn", query = "SELECT m FROM Mastercsv m WHERE m.gcColumn = :gcColumn"),
    @NamedQuery(name = "Mastercsv.findByGdColumn", query = "SELECT m FROM Mastercsv m WHERE m.gdColumn = :gdColumn"),
    @NamedQuery(name = "Mastercsv.findByGeColumn", query = "SELECT m FROM Mastercsv m WHERE m.geColumn = :geColumn"),
    @NamedQuery(name = "Mastercsv.findByGfColumn", query = "SELECT m FROM Mastercsv m WHERE m.gfColumn = :gfColumn"),
    @NamedQuery(name = "Mastercsv.findByGgColumn", query = "SELECT m FROM Mastercsv m WHERE m.ggColumn = :ggColumn"),
    @NamedQuery(name = "Mastercsv.findByGhColumn", query = "SELECT m FROM Mastercsv m WHERE m.ghColumn = :ghColumn"),
    @NamedQuery(name = "Mastercsv.findByGiColumn", query = "SELECT m FROM Mastercsv m WHERE m.giColumn = :giColumn"),
    @NamedQuery(name = "Mastercsv.findByGjColumn", query = "SELECT m FROM Mastercsv m WHERE m.gjColumn = :gjColumn"),
    @NamedQuery(name = "Mastercsv.findByGkColumn", query = "SELECT m FROM Mastercsv m WHERE m.gkColumn = :gkColumn"),
    @NamedQuery(name = "Mastercsv.findByGlColumn", query = "SELECT m FROM Mastercsv m WHERE m.glColumn = :glColumn"),
    @NamedQuery(name = "Mastercsv.findByGmColumn", query = "SELECT m FROM Mastercsv m WHERE m.gmColumn = :gmColumn"),
    @NamedQuery(name = "Mastercsv.findByGnColumn", query = "SELECT m FROM Mastercsv m WHERE m.gnColumn = :gnColumn"),
    @NamedQuery(name = "Mastercsv.findByGoColumn", query = "SELECT m FROM Mastercsv m WHERE m.goColumn = :goColumn"),
    @NamedQuery(name = "Mastercsv.findByGpColumn", query = "SELECT m FROM Mastercsv m WHERE m.gpColumn = :gpColumn"),
    @NamedQuery(name = "Mastercsv.findByGqColumn", query = "SELECT m FROM Mastercsv m WHERE m.gqColumn = :gqColumn"),
    @NamedQuery(name = "Mastercsv.findByGrColumn", query = "SELECT m FROM Mastercsv m WHERE m.grColumn = :grColumn"),
    @NamedQuery(name = "Mastercsv.findByGsColumn", query = "SELECT m FROM Mastercsv m WHERE m.gsColumn = :gsColumn"),
    @NamedQuery(name = "Mastercsv.findByGtColumn", query = "SELECT m FROM Mastercsv m WHERE m.gtColumn = :gtColumn"),
    @NamedQuery(name = "Mastercsv.findByGuColumn", query = "SELECT m FROM Mastercsv m WHERE m.guColumn = :guColumn"),
    @NamedQuery(name = "Mastercsv.findByGvColumn", query = "SELECT m FROM Mastercsv m WHERE m.gvColumn = :gvColumn"),
    @NamedQuery(name = "Mastercsv.findByGwColumn", query = "SELECT m FROM Mastercsv m WHERE m.gwColumn = :gwColumn"),
    @NamedQuery(name = "Mastercsv.findByGxColumn", query = "SELECT m FROM Mastercsv m WHERE m.gxColumn = :gxColumn"),
    @NamedQuery(name = "Mastercsv.findByGyColumn", query = "SELECT m FROM Mastercsv m WHERE m.gyColumn = :gyColumn"),
    @NamedQuery(name = "Mastercsv.findByGzColumn", query = "SELECT m FROM Mastercsv m WHERE m.gzColumn = :gzColumn"),
    @NamedQuery(name = "Mastercsv.findByHaColumn", query = "SELECT m FROM Mastercsv m WHERE m.haColumn = :haColumn"),
    @NamedQuery(name = "Mastercsv.findByHbColumn", query = "SELECT m FROM Mastercsv m WHERE m.hbColumn = :hbColumn"),
    @NamedQuery(name = "Mastercsv.findByHcColumn", query = "SELECT m FROM Mastercsv m WHERE m.hcColumn = :hcColumn"),
    @NamedQuery(name = "Mastercsv.findByHdColumn", query = "SELECT m FROM Mastercsv m WHERE m.hdColumn = :hdColumn"),
    @NamedQuery(name = "Mastercsv.findByHeColumn", query = "SELECT m FROM Mastercsv m WHERE m.heColumn = :heColumn"),
    @NamedQuery(name = "Mastercsv.findByHfColumn", query = "SELECT m FROM Mastercsv m WHERE m.hfColumn = :hfColumn"),
    @NamedQuery(name = "Mastercsv.findByHgColumn", query = "SELECT m FROM Mastercsv m WHERE m.hgColumn = :hgColumn"),
    @NamedQuery(name = "Mastercsv.findByHhColumn", query = "SELECT m FROM Mastercsv m WHERE m.hhColumn = :hhColumn"),
    @NamedQuery(name = "Mastercsv.findByHiColumn", query = "SELECT m FROM Mastercsv m WHERE m.hiColumn = :hiColumn"),
    @NamedQuery(name = "Mastercsv.findByHjColumn", query = "SELECT m FROM Mastercsv m WHERE m.hjColumn = :hjColumn"),
    @NamedQuery(name = "Mastercsv.findByHkColumn", query = "SELECT m FROM Mastercsv m WHERE m.hkColumn = :hkColumn"),
    @NamedQuery(name = "Mastercsv.findByHlColumn", query = "SELECT m FROM Mastercsv m WHERE m.hlColumn = :hlColumn"),
    @NamedQuery(name = "Mastercsv.findByHmColumn", query = "SELECT m FROM Mastercsv m WHERE m.hmColumn = :hmColumn"),
    @NamedQuery(name = "Mastercsv.findByHnColumn", query = "SELECT m FROM Mastercsv m WHERE m.hnColumn = :hnColumn"),
    @NamedQuery(name = "Mastercsv.findByHoColumn", query = "SELECT m FROM Mastercsv m WHERE m.hoColumn = :hoColumn"),
    @NamedQuery(name = "Mastercsv.findByHpColumn", query = "SELECT m FROM Mastercsv m WHERE m.hpColumn = :hpColumn"),
    @NamedQuery(name = "Mastercsv.findByHqColumn", query = "SELECT m FROM Mastercsv m WHERE m.hqColumn = :hqColumn"),
    @NamedQuery(name = "Mastercsv.findByHrColumn", query = "SELECT m FROM Mastercsv m WHERE m.hrColumn = :hrColumn"),
    @NamedQuery(name = "Mastercsv.findByHsColumn", query = "SELECT m FROM Mastercsv m WHERE m.hsColumn = :hsColumn"),
    @NamedQuery(name = "Mastercsv.findByHtColumn", query = "SELECT m FROM Mastercsv m WHERE m.htColumn = :htColumn"),
    @NamedQuery(name = "Mastercsv.findById", query = "SELECT m FROM Mastercsv m WHERE m.id = :id")})
public class Mastercsv implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "a_column")
    private Integer aColumn;
    @Column(name = "b_column")
    private String bColumn;
    @Column(name = "c_column")
    @Temporal(TemporalType.DATE)
    private Date cColumn;
    @Column(name = "d_column")
    @Temporal(TemporalType.DATE)
    private Date dColumn;
    @Column(name = "e_column")
    private String eColumn;
    @Column(name = "f_column")
    private String fColumn;
    @Column(name = "g_column")
    private Integer gColumn;
    @Column(name = "h_column")
    private Integer hColumn;
    @Column(name = "i_column")
    private Integer iColumn;
    @Column(name = "j_column")
    private Integer jColumn;
    @Column(name = "k_column")
    private Integer kColumn;
    @Column(name = "l_column")
    private Integer lColumn;
    @Column(name = "m_column")
    private Integer mColumn;
    @Column(name = "n_column")
    private Integer nColumn;
    @Column(name = "o_column")
    private Integer oColumn;
    @Column(name = "p_column")
    private Integer pColumn;
    @Column(name = "q_column")
    private Integer qColumn;
    @Column(name = "r_column")
    private Integer rColumn;
    @Column(name = "s_column")
    private Integer sColumn;
    @Column(name = "t_column")
    private Integer tColumn;
    @Column(name = "u_column")
    private String uColumn;
    @Column(name = "v_column")
    private String vColumn;
    @Column(name = "w_column")
    private String wColumn;
    @Column(name = "x_column")
    private Integer xColumn;
    @Column(name = "y_column")
    private BigInteger yColumn;
    @Column(name = "z_column")
    private String zColumn;
    @Column(name = "aa_column")
    private Integer aaColumn;
    @Column(name = "ab_column")
    private Integer abColumn;
    @Column(name = "ac_column")
    private Integer acColumn;
    @Column(name = "ad_column")
    private Integer adColumn;
    @Column(name = "ae_column")
    private Integer aeColumn;
    @Column(name = "af_column")
    private Integer afColumn;
    @Column(name = "ag_column")
    private Integer agColumn;
    @Column(name = "ah_column")
    private Integer ahColumn;
    @Column(name = "ai_column")
    private Integer aiColumn;
    @Column(name = "aj_column")
    private Integer ajColumn;
    @Column(name = "ak_column")
    private Integer akColumn;
    @Column(name = "al_column")
    private Integer alColumn;
    @Column(name = "am_column")
    private Integer amColumn;
    @Column(name = "an_column")
    private Integer anColumn;
    @Column(name = "ao_column")
    private Integer aoColumn;
    @Column(name = "ap_column")
    private Integer apColumn;
    @Column(name = "aq_column")
    private Integer aqColumn;
    @Column(name = "ar_column")
    private Integer arColumn;
    @Column(name = "as_column")
    private Integer asColumn;
    @Column(name = "at_column")
    private Integer atColumn;
    @Column(name = "au_column")
    private Integer auColumn;
    @Column(name = "av_column")
    private Integer avColumn;
    @Column(name = "aw_column")
    private Integer awColumn;
    @Column(name = "ax_column")
    private Integer axColumn;
    @Column(name = "ay_column")
    private Integer ayColumn;
    @Column(name = "az_column")
    private Integer azColumn;
    @Column(name = "ba_column")
    private Integer baColumn;
    @Column(name = "bb_column")
    private Integer bbColumn;
    @Column(name = "bc_column")
    private Integer bcColumn;
    @Column(name = "bd_column")
    private Integer bdColumn;
    @Column(name = "be_column")
    private Integer beColumn;
    @Column(name = "bf_column")
    private Integer bfColumn;
    @Column(name = "bg_column")
    private Integer bgColumn;
    @Column(name = "bh_column")
    private Integer bhColumn;
    @Column(name = "bi_column")
    private Integer biColumn;
    @Column(name = "bj_column")
    private Integer bjColumn;
    @Column(name = "bk_column")
    private Integer bkColumn;
    @Column(name = "bl_column")
    private Integer blColumn;
    @Column(name = "bm_column")
    private Integer bmColumn;
    @Column(name = "bn_column")
    private Integer bnColumn;
    @Column(name = "bo_column")
    private Integer boColumn;
    @Column(name = "bp_column")
    private Integer bpColumn;
    @Column(name = "bq_column")
    private Integer bqColumn;
    @Column(name = "br_column")
    private Integer brColumn;
    @Column(name = "bs_column")
    private Integer bsColumn;
    @Column(name = "bt_column")
    private Integer btColumn;
    @Column(name = "bu_column")
    private Integer buColumn;
    @Column(name = "bv_column")
    private Integer bvColumn;
    @Column(name = "bw_column")
    private Integer bwColumn;
    @Column(name = "bx_column")
    private Integer bxColumn;
    @Column(name = "by_column")
    private Integer byColumn;
    @Column(name = "bz_column")
    private Integer bzColumn;
    @Column(name = "ca_column")
    private Integer caColumn;
    @Column(name = "cb_column")
    private Integer cbColumn;
    @Column(name = "cc_column")
    private Integer ccColumn;
    @Column(name = "cd_column")
    private Integer cdColumn;
    @Column(name = "ce_column")
    private Integer ceColumn;
    @Column(name = "cf_column")
    private Integer cfColumn;
    @Column(name = "cg_column")
    private Integer cgColumn;
    @Column(name = "ch_column")
    private Integer chColumn;
    @Column(name = "ci_column")
    private Integer ciColumn;
    @Column(name = "cj_column")
    private Integer cjColumn;
    @Column(name = "ck_column")
    private Integer ckColumn;
    @Column(name = "cl_column")
    private Integer clColumn;
    @Column(name = "cm_column")
    private Integer cmColumn;
    @Column(name = "cn_column")
    private Integer cnColumn;
    @Column(name = "co_column")
    private Integer coColumn;
    @Column(name = "cp_column")
    private Integer cpColumn;
    @Column(name = "cq_column")
    private Integer cqColumn;
    @Column(name = "cr_column")
    private Integer crColumn;
    @Column(name = "cs_column")
    private Integer csColumn;
    @Column(name = "ct_column")
    private Integer ctColumn;
    @Column(name = "cu_column")
    private Integer cuColumn;
    @Column(name = "cv_column")
    private Integer cvColumn;
    @Column(name = "cw_column")
    private Integer cwColumn;
    @Column(name = "cx_column")
    private Integer cxColumn;
    @Column(name = "cy_column")
    private Integer cyColumn;
    @Column(name = "cz_column")
    private Integer czColumn;
    @Column(name = "da_column")
    private Integer daColumn;
    @Column(name = "db_column")
    private Integer dbColumn;
    @Column(name = "dc_column")
    private Integer dcColumn;
    @Column(name = "dd_column")
    private Integer ddColumn;
    @Column(name = "de_column")
    private Integer deColumn;
    @Column(name = "df_column")
    private Integer dfColumn;
    @Column(name = "dg_column")
    private Integer dgColumn;
    @Column(name = "dh_column")
    private Integer dhColumn;
    @Column(name = "di_column")
    private Integer diColumn;
    @Column(name = "dj_column")
    private Integer djColumn;
    @Column(name = "dk_column")
    private Integer dkColumn;
    @Column(name = "dl_column")
    private Integer dlColumn;
    @Column(name = "dm_column")
    private Integer dmColumn;
    @Column(name = "dn_column")
    private Integer dnColumn;
    @Column(name = "do_column")
    private Integer doColumn;
    @Column(name = "dp_column")
    private Integer dpColumn;
    @Column(name = "dq_column")
    private Integer dqColumn;
    @Column(name = "dr_column")
    private Integer drColumn;
    @Column(name = "ds_column")
    private Integer dsColumn;
    @Column(name = "dt_column")
    private Integer dtColumn;
    @Column(name = "du_column")
    private Integer duColumn;
    @Column(name = "dv_column")
    private Integer dvColumn;
    @Column(name = "dw_column")
    private Integer dwColumn;
    @Column(name = "dx_column")
    private Integer dxColumn;
    @Column(name = "dy_column")
    private Integer dyColumn;
    @Column(name = "dz_column")
    private Integer dzColumn;
    @Column(name = "ea_column")
    private Integer eaColumn;
    @Column(name = "eb_column")
    private Integer ebColumn;
    @Column(name = "ec_column")
    private Integer ecColumn;
    @Column(name = "ed_column")
    private Integer edColumn;
    @Column(name = "ee_column")
    private Integer eeColumn;
    @Column(name = "ef_column")
    private Integer efColumn;
    @Column(name = "eg_column")
    private Integer egColumn;
    @Column(name = "eh_column")
    private Integer ehColumn;
    @Column(name = "ei_column")
    private Integer eiColumn;
    @Column(name = "ej_column")
    private Integer ejColumn;
    @Column(name = "ek_column")
    private Integer ekColumn;
    @Column(name = "el_column")
    private Integer elColumn;
    @Column(name = "em_column")
    private Integer emColumn;
    @Column(name = "en_column")
    private Integer enColumn;
    @Column(name = "eo_column")
    private Integer eoColumn;
    @Column(name = "ep_column")
    private Integer epColumn;
    @Column(name = "eq_column")
    private Integer eqColumn;
    @Column(name = "er_column")
    private Integer erColumn;
    @Column(name = "es_column")
    private Integer esColumn;
    @Column(name = "et_column")
    private Integer etColumn;
    @Column(name = "eu_column")
    private Integer euColumn;
    @Column(name = "ev_column")
    private Integer evColumn;
    @Column(name = "ew_column")
    private Integer ewColumn;
    @Column(name = "ex_column")
    private Integer exColumn;
    @Column(name = "ey_column")
    private Integer eyColumn;
    @Column(name = "ez_column")
    private Integer ezColumn;
    @Column(name = "fa_column")
    private Integer faColumn;
    @Column(name = "fb_column")
    private Integer fbColumn;
    @Column(name = "fc_column")
    private Integer fcColumn;
    @Column(name = "fd_column")
    private Integer fdColumn;
    @Column(name = "fe_column")
    private Integer feColumn;
    @Column(name = "ff_column")
    private Integer ffColumn;
    @Column(name = "fg_column")
    private Integer fgColumn;
    @Column(name = "fh_column")
    private Integer fhColumn;
    @Column(name = "fi_column")
    private Integer fiColumn;
    @Column(name = "fj_column")
    private Integer fjColumn;
    @Column(name = "fk_column")
    private Integer fkColumn;
    @Column(name = "fl_column")
    private Integer flColumn;
    @Column(name = "fm_column")
    private Integer fmColumn;
    @Column(name = "fn_column")
    private Integer fnColumn;
    @Column(name = "fo_column")
    private Integer foColumn;
    @Column(name = "fp_column")
    private Integer fpColumn;
    @Column(name = "fq_column")
    private Integer fqColumn;
    @Column(name = "fr_column")
    private Integer frColumn;
    @Column(name = "fs_column")
    private Integer fsColumn;
    @Column(name = "ft_column")
    private Integer ftColumn;
    @Column(name = "fu_column")
    private Integer fuColumn;
    @Column(name = "fv_column")
    private Integer fvColumn;
    @Column(name = "fw_column")
    private Integer fwColumn;
    @Column(name = "fx_column")
    private Integer fxColumn;
    @Column(name = "fy_column")
    private Integer fyColumn;
    @Column(name = "fz_column")
    private Integer fzColumn;
    @Column(name = "ga_column")
    private Integer gaColumn;
    @Column(name = "gb_column")
    private Integer gbColumn;
    @Column(name = "gc_column")
    private Integer gcColumn;
    @Column(name = "gd_column")
    private Integer gdColumn;
    @Column(name = "ge_column")
    private Integer geColumn;
    @Column(name = "gf_column")
    private Integer gfColumn;
    @Column(name = "gg_column")
    private Integer ggColumn;
    @Column(name = "gh_column")
    private Integer ghColumn;
    @Column(name = "gi_column")
    private Integer giColumn;
    @Column(name = "gj_column")
    private Integer gjColumn;
    @Column(name = "gk_column")
    private Integer gkColumn;
    @Column(name = "gl_column")
    private Integer glColumn;
    @Column(name = "gm_column")
    private Integer gmColumn;
    @Column(name = "gn_column")
    private Integer gnColumn;
    @Column(name = "go_column")
    private Integer goColumn;
    @Column(name = "gp_column")
    private Integer gpColumn;
    @Column(name = "gq_column")
    private Integer gqColumn;
    @Column(name = "gr_column")
    private Integer grColumn;
    @Column(name = "gs_column")
    private Integer gsColumn;
    @Column(name = "gt_column")
    private Integer gtColumn;
    @Column(name = "gu_column")
    private Integer guColumn;
    @Column(name = "gv_column")
    private Integer gvColumn;
    @Column(name = "gw_column")
    private Integer gwColumn;
    @Column(name = "gx_column")
    private Integer gxColumn;
    @Column(name = "gy_column")
    private Integer gyColumn;
    @Column(name = "gz_column")
    private Integer gzColumn;
    @Column(name = "ha_column")
    private Integer haColumn;
    @Column(name = "hb_column")
    private Integer hbColumn;
    @Column(name = "hc_column")
    private Integer hcColumn;
    @Column(name = "hd_column")
    private Integer hdColumn;
    @Column(name = "he_column")
    private Integer heColumn;
    @Column(name = "hf_column")
    private Integer hfColumn;
    @Column(name = "hg_column")
    private Integer hgColumn;
    @Column(name = "hh_column")
    private Integer hhColumn;
    @Column(name = "hi_column")
    private Integer hiColumn;
    @Column(name = "hj_column")
    private Integer hjColumn;
    @Column(name = "hk_column")
    private Integer hkColumn;
    @Column(name = "hl_column")
    private Integer hlColumn;
    @Column(name = "hm_column")
    private Integer hmColumn;
    @Column(name = "hn_column")
    private Integer hnColumn;
    @Column(name = "ho_column")
    private Integer hoColumn;
    @Column(name = "hp_column")
    private Integer hpColumn;
    @Column(name = "hq_column")
    private Integer hqColumn;
    @Column(name = "hr_column")
    private Integer hrColumn;
    @Column(name = "hs_column")
    private Integer hsColumn;
    @Column(name = "ht_column")
    private Integer htColumn;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public Mastercsv() {
    }

    public Mastercsv(Integer id) {
        this.id = id;
    }

    public Integer getAColumn() {
        return aColumn;
    }

    public void setAColumn(Integer aColumn) {
        this.aColumn = aColumn;
    }

    public String getBColumn() {
        return bColumn;
    }

    public void setBColumn(String bColumn) {
        this.bColumn = bColumn;
    }

    public Date getCColumn() {
        return cColumn;
    }

    public void setCColumn(Date cColumn) {
        this.cColumn = cColumn;
    }

    public Date getDColumn() {
        return dColumn;
    }

    public void setDColumn(Date dColumn) {
        this.dColumn = dColumn;
    }

    public String getEColumn() {
        return eColumn;
    }

    public void setEColumn(String eColumn) {
        this.eColumn = eColumn;
    }

    public String getFColumn() {
        return fColumn;
    }

    public void setFColumn(String fColumn) {
        this.fColumn = fColumn;
    }

    public Integer getGColumn() {
        return gColumn;
    }

    public void setGColumn(Integer gColumn) {
        this.gColumn = gColumn;
    }

    public Integer getHColumn() {
        return hColumn;
    }

    public void setHColumn(Integer hColumn) {
        this.hColumn = hColumn;
    }

    public Integer getIColumn() {
        return iColumn;
    }

    public void setIColumn(Integer iColumn) {
        this.iColumn = iColumn;
    }

    public Integer getJColumn() {
        return jColumn;
    }

    public void setJColumn(Integer jColumn) {
        this.jColumn = jColumn;
    }

    public Integer getKColumn() {
        return kColumn;
    }

    public void setKColumn(Integer kColumn) {
        this.kColumn = kColumn;
    }

    public Integer getLColumn() {
        return lColumn;
    }

    public void setLColumn(Integer lColumn) {
        this.lColumn = lColumn;
    }

    public Integer getMColumn() {
        return mColumn;
    }

    public void setMColumn(Integer mColumn) {
        this.mColumn = mColumn;
    }

    public Integer getNColumn() {
        return nColumn;
    }

    public void setNColumn(Integer nColumn) {
        this.nColumn = nColumn;
    }

    public Integer getOColumn() {
        return oColumn;
    }

    public void setOColumn(Integer oColumn) {
        this.oColumn = oColumn;
    }

    public Integer getPColumn() {
        return pColumn;
    }

    public void setPColumn(Integer pColumn) {
        this.pColumn = pColumn;
    }

    public Integer getQColumn() {
        return qColumn;
    }

    public void setQColumn(Integer qColumn) {
        this.qColumn = qColumn;
    }

    public Integer getRColumn() {
        return rColumn;
    }

    public void setRColumn(Integer rColumn) {
        this.rColumn = rColumn;
    }

    public Integer getSColumn() {
        return sColumn;
    }

    public void setSColumn(Integer sColumn) {
        this.sColumn = sColumn;
    }

    public Integer getTColumn() {
        return tColumn;
    }

    public void setTColumn(Integer tColumn) {
        this.tColumn = tColumn;
    }

    public String getUColumn() {
        return uColumn;
    }

    public void setUColumn(String uColumn) {
        this.uColumn = uColumn;
    }

    public String getVColumn() {
        return vColumn;
    }

    public void setVColumn(String vColumn) {
        this.vColumn = vColumn;
    }

    public String getWColumn() {
        return wColumn;
    }

    public void setWColumn(String wColumn) {
        this.wColumn = wColumn;
    }

    public Integer getXColumn() {
        return xColumn;
    }

    public void setXColumn(Integer xColumn) {
        this.xColumn = xColumn;
    }

    public BigInteger getYColumn() {
        return yColumn;
    }

    public void setYColumn(BigInteger yColumn) {
        this.yColumn = yColumn;
    }

    public String getZColumn() {
        return zColumn;
    }

    public void setZColumn(String zColumn) {
        this.zColumn = zColumn;
    }

    public Integer getAaColumn() {
        return aaColumn;
    }

    public void setAaColumn(Integer aaColumn) {
        this.aaColumn = aaColumn;
    }

    public Integer getAbColumn() {
        return abColumn;
    }

    public void setAbColumn(Integer abColumn) {
        this.abColumn = abColumn;
    }

    public Integer getAcColumn() {
        return acColumn;
    }

    public void setAcColumn(Integer acColumn) {
        this.acColumn = acColumn;
    }

    public Integer getAdColumn() {
        return adColumn;
    }

    public void setAdColumn(Integer adColumn) {
        this.adColumn = adColumn;
    }

    public Integer getAeColumn() {
        return aeColumn;
    }

    public void setAeColumn(Integer aeColumn) {
        this.aeColumn = aeColumn;
    }

    public Integer getAfColumn() {
        return afColumn;
    }

    public void setAfColumn(Integer afColumn) {
        this.afColumn = afColumn;
    }

    public Integer getAgColumn() {
        return agColumn;
    }

    public void setAgColumn(Integer agColumn) {
        this.agColumn = agColumn;
    }

    public Integer getAhColumn() {
        return ahColumn;
    }

    public void setAhColumn(Integer ahColumn) {
        this.ahColumn = ahColumn;
    }

    public Integer getAiColumn() {
        return aiColumn;
    }

    public void setAiColumn(Integer aiColumn) {
        this.aiColumn = aiColumn;
    }

    public Integer getAjColumn() {
        return ajColumn;
    }

    public void setAjColumn(Integer ajColumn) {
        this.ajColumn = ajColumn;
    }

    public Integer getAkColumn() {
        return akColumn;
    }

    public void setAkColumn(Integer akColumn) {
        this.akColumn = akColumn;
    }

    public Integer getAlColumn() {
        return alColumn;
    }

    public void setAlColumn(Integer alColumn) {
        this.alColumn = alColumn;
    }

    public Integer getAmColumn() {
        return amColumn;
    }

    public void setAmColumn(Integer amColumn) {
        this.amColumn = amColumn;
    }

    public Integer getAnColumn() {
        return anColumn;
    }

    public void setAnColumn(Integer anColumn) {
        this.anColumn = anColumn;
    }

    public Integer getAoColumn() {
        return aoColumn;
    }

    public void setAoColumn(Integer aoColumn) {
        this.aoColumn = aoColumn;
    }

    public Integer getApColumn() {
        return apColumn;
    }

    public void setApColumn(Integer apColumn) {
        this.apColumn = apColumn;
    }

    public Integer getAqColumn() {
        return aqColumn;
    }

    public void setAqColumn(Integer aqColumn) {
        this.aqColumn = aqColumn;
    }

    public Integer getArColumn() {
        return arColumn;
    }

    public void setArColumn(Integer arColumn) {
        this.arColumn = arColumn;
    }

    public Integer getAsColumn() {
        return asColumn;
    }

    public void setAsColumn(Integer asColumn) {
        this.asColumn = asColumn;
    }

    public Integer getAtColumn() {
        return atColumn;
    }

    public void setAtColumn(Integer atColumn) {
        this.atColumn = atColumn;
    }

    public Integer getAuColumn() {
        return auColumn;
    }

    public void setAuColumn(Integer auColumn) {
        this.auColumn = auColumn;
    }

    public Integer getAvColumn() {
        return avColumn;
    }

    public void setAvColumn(Integer avColumn) {
        this.avColumn = avColumn;
    }

    public Integer getAwColumn() {
        return awColumn;
    }

    public void setAwColumn(Integer awColumn) {
        this.awColumn = awColumn;
    }

    public Integer getAxColumn() {
        return axColumn;
    }

    public void setAxColumn(Integer axColumn) {
        this.axColumn = axColumn;
    }

    public Integer getAyColumn() {
        return ayColumn;
    }

    public void setAyColumn(Integer ayColumn) {
        this.ayColumn = ayColumn;
    }

    public Integer getAzColumn() {
        return azColumn;
    }

    public void setAzColumn(Integer azColumn) {
        this.azColumn = azColumn;
    }

    public Integer getBaColumn() {
        return baColumn;
    }

    public void setBaColumn(Integer baColumn) {
        this.baColumn = baColumn;
    }

    public Integer getBbColumn() {
        return bbColumn;
    }

    public void setBbColumn(Integer bbColumn) {
        this.bbColumn = bbColumn;
    }

    public Integer getBcColumn() {
        return bcColumn;
    }

    public void setBcColumn(Integer bcColumn) {
        this.bcColumn = bcColumn;
    }

    public Integer getBdColumn() {
        return bdColumn;
    }

    public void setBdColumn(Integer bdColumn) {
        this.bdColumn = bdColumn;
    }

    public Integer getBeColumn() {
        return beColumn;
    }

    public void setBeColumn(Integer beColumn) {
        this.beColumn = beColumn;
    }

    public Integer getBfColumn() {
        return bfColumn;
    }

    public void setBfColumn(Integer bfColumn) {
        this.bfColumn = bfColumn;
    }

    public Integer getBgColumn() {
        return bgColumn;
    }

    public void setBgColumn(Integer bgColumn) {
        this.bgColumn = bgColumn;
    }

    public Integer getBhColumn() {
        return bhColumn;
    }

    public void setBhColumn(Integer bhColumn) {
        this.bhColumn = bhColumn;
    }

    public Integer getBiColumn() {
        return biColumn;
    }

    public void setBiColumn(Integer biColumn) {
        this.biColumn = biColumn;
    }

    public Integer getBjColumn() {
        return bjColumn;
    }

    public void setBjColumn(Integer bjColumn) {
        this.bjColumn = bjColumn;
    }

    public Integer getBkColumn() {
        return bkColumn;
    }

    public void setBkColumn(Integer bkColumn) {
        this.bkColumn = bkColumn;
    }

    public Integer getBlColumn() {
        return blColumn;
    }

    public void setBlColumn(Integer blColumn) {
        this.blColumn = blColumn;
    }

    public Integer getBmColumn() {
        return bmColumn;
    }

    public void setBmColumn(Integer bmColumn) {
        this.bmColumn = bmColumn;
    }

    public Integer getBnColumn() {
        return bnColumn;
    }

    public void setBnColumn(Integer bnColumn) {
        this.bnColumn = bnColumn;
    }

    public Integer getBoColumn() {
        return boColumn;
    }

    public void setBoColumn(Integer boColumn) {
        this.boColumn = boColumn;
    }

    public Integer getBpColumn() {
        return bpColumn;
    }

    public void setBpColumn(Integer bpColumn) {
        this.bpColumn = bpColumn;
    }

    public Integer getBqColumn() {
        return bqColumn;
    }

    public void setBqColumn(Integer bqColumn) {
        this.bqColumn = bqColumn;
    }

    public Integer getBrColumn() {
        return brColumn;
    }

    public void setBrColumn(Integer brColumn) {
        this.brColumn = brColumn;
    }

    public Integer getBsColumn() {
        return bsColumn;
    }

    public void setBsColumn(Integer bsColumn) {
        this.bsColumn = bsColumn;
    }

    public Integer getBtColumn() {
        return btColumn;
    }

    public void setBtColumn(Integer btColumn) {
        this.btColumn = btColumn;
    }

    public Integer getBuColumn() {
        return buColumn;
    }

    public void setBuColumn(Integer buColumn) {
        this.buColumn = buColumn;
    }

    public Integer getBvColumn() {
        return bvColumn;
    }

    public void setBvColumn(Integer bvColumn) {
        this.bvColumn = bvColumn;
    }

    public Integer getBwColumn() {
        return bwColumn;
    }

    public void setBwColumn(Integer bwColumn) {
        this.bwColumn = bwColumn;
    }

    public Integer getBxColumn() {
        return bxColumn;
    }

    public void setBxColumn(Integer bxColumn) {
        this.bxColumn = bxColumn;
    }

    public Integer getByColumn() {
        return byColumn;
    }

    public void setByColumn(Integer byColumn) {
        this.byColumn = byColumn;
    }

    public Integer getBzColumn() {
        return bzColumn;
    }

    public void setBzColumn(Integer bzColumn) {
        this.bzColumn = bzColumn;
    }

    public Integer getCaColumn() {
        return caColumn;
    }

    public void setCaColumn(Integer caColumn) {
        this.caColumn = caColumn;
    }

    public Integer getCbColumn() {
        return cbColumn;
    }

    public void setCbColumn(Integer cbColumn) {
        this.cbColumn = cbColumn;
    }

    public Integer getCcColumn() {
        return ccColumn;
    }

    public void setCcColumn(Integer ccColumn) {
        this.ccColumn = ccColumn;
    }

    public Integer getCdColumn() {
        return cdColumn;
    }

    public void setCdColumn(Integer cdColumn) {
        this.cdColumn = cdColumn;
    }

    public Integer getCeColumn() {
        return ceColumn;
    }

    public void setCeColumn(Integer ceColumn) {
        this.ceColumn = ceColumn;
    }

    public Integer getCfColumn() {
        return cfColumn;
    }

    public void setCfColumn(Integer cfColumn) {
        this.cfColumn = cfColumn;
    }

    public Integer getCgColumn() {
        return cgColumn;
    }

    public void setCgColumn(Integer cgColumn) {
        this.cgColumn = cgColumn;
    }

    public Integer getChColumn() {
        return chColumn;
    }

    public void setChColumn(Integer chColumn) {
        this.chColumn = chColumn;
    }

    public Integer getCiColumn() {
        return ciColumn;
    }

    public void setCiColumn(Integer ciColumn) {
        this.ciColumn = ciColumn;
    }

    public Integer getCjColumn() {
        return cjColumn;
    }

    public void setCjColumn(Integer cjColumn) {
        this.cjColumn = cjColumn;
    }

    public Integer getCkColumn() {
        return ckColumn;
    }

    public void setCkColumn(Integer ckColumn) {
        this.ckColumn = ckColumn;
    }

    public Integer getClColumn() {
        return clColumn;
    }

    public void setClColumn(Integer clColumn) {
        this.clColumn = clColumn;
    }

    public Integer getCmColumn() {
        return cmColumn;
    }

    public void setCmColumn(Integer cmColumn) {
        this.cmColumn = cmColumn;
    }

    public Integer getCnColumn() {
        return cnColumn;
    }

    public void setCnColumn(Integer cnColumn) {
        this.cnColumn = cnColumn;
    }

    public Integer getCoColumn() {
        return coColumn;
    }

    public void setCoColumn(Integer coColumn) {
        this.coColumn = coColumn;
    }

    public Integer getCpColumn() {
        return cpColumn;
    }

    public void setCpColumn(Integer cpColumn) {
        this.cpColumn = cpColumn;
    }

    public Integer getCqColumn() {
        return cqColumn;
    }

    public void setCqColumn(Integer cqColumn) {
        this.cqColumn = cqColumn;
    }

    public Integer getCrColumn() {
        return crColumn;
    }

    public void setCrColumn(Integer crColumn) {
        this.crColumn = crColumn;
    }

    public Integer getCsColumn() {
        return csColumn;
    }

    public void setCsColumn(Integer csColumn) {
        this.csColumn = csColumn;
    }

    public Integer getCtColumn() {
        return ctColumn;
    }

    public void setCtColumn(Integer ctColumn) {
        this.ctColumn = ctColumn;
    }

    public Integer getCuColumn() {
        return cuColumn;
    }

    public void setCuColumn(Integer cuColumn) {
        this.cuColumn = cuColumn;
    }

    public Integer getCvColumn() {
        return cvColumn;
    }

    public void setCvColumn(Integer cvColumn) {
        this.cvColumn = cvColumn;
    }

    public Integer getCwColumn() {
        return cwColumn;
    }

    public void setCwColumn(Integer cwColumn) {
        this.cwColumn = cwColumn;
    }

    public Integer getCxColumn() {
        return cxColumn;
    }

    public void setCxColumn(Integer cxColumn) {
        this.cxColumn = cxColumn;
    }

    public Integer getCyColumn() {
        return cyColumn;
    }

    public void setCyColumn(Integer cyColumn) {
        this.cyColumn = cyColumn;
    }

    public Integer getCzColumn() {
        return czColumn;
    }

    public void setCzColumn(Integer czColumn) {
        this.czColumn = czColumn;
    }

    public Integer getDaColumn() {
        return daColumn;
    }

    public void setDaColumn(Integer daColumn) {
        this.daColumn = daColumn;
    }

    public Integer getDbColumn() {
        return dbColumn;
    }

    public void setDbColumn(Integer dbColumn) {
        this.dbColumn = dbColumn;
    }

    public Integer getDcColumn() {
        return dcColumn;
    }

    public void setDcColumn(Integer dcColumn) {
        this.dcColumn = dcColumn;
    }

    public Integer getDdColumn() {
        return ddColumn;
    }

    public void setDdColumn(Integer ddColumn) {
        this.ddColumn = ddColumn;
    }

    public Integer getDeColumn() {
        return deColumn;
    }

    public void setDeColumn(Integer deColumn) {
        this.deColumn = deColumn;
    }

    public Integer getDfColumn() {
        return dfColumn;
    }

    public void setDfColumn(Integer dfColumn) {
        this.dfColumn = dfColumn;
    }

    public Integer getDgColumn() {
        return dgColumn;
    }

    public void setDgColumn(Integer dgColumn) {
        this.dgColumn = dgColumn;
    }

    public Integer getDhColumn() {
        return dhColumn;
    }

    public void setDhColumn(Integer dhColumn) {
        this.dhColumn = dhColumn;
    }

    public Integer getDiColumn() {
        return diColumn;
    }

    public void setDiColumn(Integer diColumn) {
        this.diColumn = diColumn;
    }

    public Integer getDjColumn() {
        return djColumn;
    }

    public void setDjColumn(Integer djColumn) {
        this.djColumn = djColumn;
    }

    public Integer getDkColumn() {
        return dkColumn;
    }

    public void setDkColumn(Integer dkColumn) {
        this.dkColumn = dkColumn;
    }

    public Integer getDlColumn() {
        return dlColumn;
    }

    public void setDlColumn(Integer dlColumn) {
        this.dlColumn = dlColumn;
    }

    public Integer getDmColumn() {
        return dmColumn;
    }

    public void setDmColumn(Integer dmColumn) {
        this.dmColumn = dmColumn;
    }

    public Integer getDnColumn() {
        return dnColumn;
    }

    public void setDnColumn(Integer dnColumn) {
        this.dnColumn = dnColumn;
    }

    public Integer getDoColumn() {
        return doColumn;
    }

    public void setDoColumn(Integer doColumn) {
        this.doColumn = doColumn;
    }

    public Integer getDpColumn() {
        return dpColumn;
    }

    public void setDpColumn(Integer dpColumn) {
        this.dpColumn = dpColumn;
    }

    public Integer getDqColumn() {
        return dqColumn;
    }

    public void setDqColumn(Integer dqColumn) {
        this.dqColumn = dqColumn;
    }

    public Integer getDrColumn() {
        return drColumn;
    }

    public void setDrColumn(Integer drColumn) {
        this.drColumn = drColumn;
    }

    public Integer getDsColumn() {
        return dsColumn;
    }

    public void setDsColumn(Integer dsColumn) {
        this.dsColumn = dsColumn;
    }

    public Integer getDtColumn() {
        return dtColumn;
    }

    public void setDtColumn(Integer dtColumn) {
        this.dtColumn = dtColumn;
    }

    public Integer getDuColumn() {
        return duColumn;
    }

    public void setDuColumn(Integer duColumn) {
        this.duColumn = duColumn;
    }

    public Integer getDvColumn() {
        return dvColumn;
    }

    public void setDvColumn(Integer dvColumn) {
        this.dvColumn = dvColumn;
    }

    public Integer getDwColumn() {
        return dwColumn;
    }

    public void setDwColumn(Integer dwColumn) {
        this.dwColumn = dwColumn;
    }

    public Integer getDxColumn() {
        return dxColumn;
    }

    public void setDxColumn(Integer dxColumn) {
        this.dxColumn = dxColumn;
    }

    public Integer getDyColumn() {
        return dyColumn;
    }

    public void setDyColumn(Integer dyColumn) {
        this.dyColumn = dyColumn;
    }

    public Integer getDzColumn() {
        return dzColumn;
    }

    public void setDzColumn(Integer dzColumn) {
        this.dzColumn = dzColumn;
    }

    public Integer getEaColumn() {
        return eaColumn;
    }

    public void setEaColumn(Integer eaColumn) {
        this.eaColumn = eaColumn;
    }

    public Integer getEbColumn() {
        return ebColumn;
    }

    public void setEbColumn(Integer ebColumn) {
        this.ebColumn = ebColumn;
    }

    public Integer getEcColumn() {
        return ecColumn;
    }

    public void setEcColumn(Integer ecColumn) {
        this.ecColumn = ecColumn;
    }

    public Integer getEdColumn() {
        return edColumn;
    }

    public void setEdColumn(Integer edColumn) {
        this.edColumn = edColumn;
    }

    public Integer getEeColumn() {
        return eeColumn;
    }

    public void setEeColumn(Integer eeColumn) {
        this.eeColumn = eeColumn;
    }

    public Integer getEfColumn() {
        return efColumn;
    }

    public void setEfColumn(Integer efColumn) {
        this.efColumn = efColumn;
    }

    public Integer getEgColumn() {
        return egColumn;
    }

    public void setEgColumn(Integer egColumn) {
        this.egColumn = egColumn;
    }

    public Integer getEhColumn() {
        return ehColumn;
    }

    public void setEhColumn(Integer ehColumn) {
        this.ehColumn = ehColumn;
    }

    public Integer getEiColumn() {
        return eiColumn;
    }

    public void setEiColumn(Integer eiColumn) {
        this.eiColumn = eiColumn;
    }

    public Integer getEjColumn() {
        return ejColumn;
    }

    public void setEjColumn(Integer ejColumn) {
        this.ejColumn = ejColumn;
    }

    public Integer getEkColumn() {
        return ekColumn;
    }

    public void setEkColumn(Integer ekColumn) {
        this.ekColumn = ekColumn;
    }

    public Integer getElColumn() {
        return elColumn;
    }

    public void setElColumn(Integer elColumn) {
        this.elColumn = elColumn;
    }

    public Integer getEmColumn() {
        return emColumn;
    }

    public void setEmColumn(Integer emColumn) {
        this.emColumn = emColumn;
    }

    public Integer getEnColumn() {
        return enColumn;
    }

    public void setEnColumn(Integer enColumn) {
        this.enColumn = enColumn;
    }

    public Integer getEoColumn() {
        return eoColumn;
    }

    public void setEoColumn(Integer eoColumn) {
        this.eoColumn = eoColumn;
    }

    public Integer getEpColumn() {
        return epColumn;
    }

    public void setEpColumn(Integer epColumn) {
        this.epColumn = epColumn;
    }

    public Integer getEqColumn() {
        return eqColumn;
    }

    public void setEqColumn(Integer eqColumn) {
        this.eqColumn = eqColumn;
    }

    public Integer getErColumn() {
        return erColumn;
    }

    public void setErColumn(Integer erColumn) {
        this.erColumn = erColumn;
    }

    public Integer getEsColumn() {
        return esColumn;
    }

    public void setEsColumn(Integer esColumn) {
        this.esColumn = esColumn;
    }

    public Integer getEtColumn() {
        return etColumn;
    }

    public void setEtColumn(Integer etColumn) {
        this.etColumn = etColumn;
    }

    public Integer getEuColumn() {
        return euColumn;
    }

    public void setEuColumn(Integer euColumn) {
        this.euColumn = euColumn;
    }

    public Integer getEvColumn() {
        return evColumn;
    }

    public void setEvColumn(Integer evColumn) {
        this.evColumn = evColumn;
    }

    public Integer getEwColumn() {
        return ewColumn;
    }

    public void setEwColumn(Integer ewColumn) {
        this.ewColumn = ewColumn;
    }

    public Integer getExColumn() {
        return exColumn;
    }

    public void setExColumn(Integer exColumn) {
        this.exColumn = exColumn;
    }

    public Integer getEyColumn() {
        return eyColumn;
    }

    public void setEyColumn(Integer eyColumn) {
        this.eyColumn = eyColumn;
    }

    public Integer getEzColumn() {
        return ezColumn;
    }

    public void setEzColumn(Integer ezColumn) {
        this.ezColumn = ezColumn;
    }

    public Integer getFaColumn() {
        return faColumn;
    }

    public void setFaColumn(Integer faColumn) {
        this.faColumn = faColumn;
    }

    public Integer getFbColumn() {
        return fbColumn;
    }

    public void setFbColumn(Integer fbColumn) {
        this.fbColumn = fbColumn;
    }

    public Integer getFcColumn() {
        return fcColumn;
    }

    public void setFcColumn(Integer fcColumn) {
        this.fcColumn = fcColumn;
    }

    public Integer getFdColumn() {
        return fdColumn;
    }

    public void setFdColumn(Integer fdColumn) {
        this.fdColumn = fdColumn;
    }

    public Integer getFeColumn() {
        return feColumn;
    }

    public void setFeColumn(Integer feColumn) {
        this.feColumn = feColumn;
    }

    public Integer getFfColumn() {
        return ffColumn;
    }

    public void setFfColumn(Integer ffColumn) {
        this.ffColumn = ffColumn;
    }

    public Integer getFgColumn() {
        return fgColumn;
    }

    public void setFgColumn(Integer fgColumn) {
        this.fgColumn = fgColumn;
    }

    public Integer getFhColumn() {
        return fhColumn;
    }

    public void setFhColumn(Integer fhColumn) {
        this.fhColumn = fhColumn;
    }

    public Integer getFiColumn() {
        return fiColumn;
    }

    public void setFiColumn(Integer fiColumn) {
        this.fiColumn = fiColumn;
    }

    public Integer getFjColumn() {
        return fjColumn;
    }

    public void setFjColumn(Integer fjColumn) {
        this.fjColumn = fjColumn;
    }

    public Integer getFkColumn() {
        return fkColumn;
    }

    public void setFkColumn(Integer fkColumn) {
        this.fkColumn = fkColumn;
    }

    public Integer getFlColumn() {
        return flColumn;
    }

    public void setFlColumn(Integer flColumn) {
        this.flColumn = flColumn;
    }

    public Integer getFmColumn() {
        return fmColumn;
    }

    public void setFmColumn(Integer fmColumn) {
        this.fmColumn = fmColumn;
    }

    public Integer getFnColumn() {
        return fnColumn;
    }

    public void setFnColumn(Integer fnColumn) {
        this.fnColumn = fnColumn;
    }

    public Integer getFoColumn() {
        return foColumn;
    }

    public void setFoColumn(Integer foColumn) {
        this.foColumn = foColumn;
    }

    public Integer getFpColumn() {
        return fpColumn;
    }

    public void setFpColumn(Integer fpColumn) {
        this.fpColumn = fpColumn;
    }

    public Integer getFqColumn() {
        return fqColumn;
    }

    public void setFqColumn(Integer fqColumn) {
        this.fqColumn = fqColumn;
    }

    public Integer getFrColumn() {
        return frColumn;
    }

    public void setFrColumn(Integer frColumn) {
        this.frColumn = frColumn;
    }

    public Integer getFsColumn() {
        return fsColumn;
    }

    public void setFsColumn(Integer fsColumn) {
        this.fsColumn = fsColumn;
    }

    public Integer getFtColumn() {
        return ftColumn;
    }

    public void setFtColumn(Integer ftColumn) {
        this.ftColumn = ftColumn;
    }

    public Integer getFuColumn() {
        return fuColumn;
    }

    public void setFuColumn(Integer fuColumn) {
        this.fuColumn = fuColumn;
    }

    public Integer getFvColumn() {
        return fvColumn;
    }

    public void setFvColumn(Integer fvColumn) {
        this.fvColumn = fvColumn;
    }

    public Integer getFwColumn() {
        return fwColumn;
    }

    public void setFwColumn(Integer fwColumn) {
        this.fwColumn = fwColumn;
    }

    public Integer getFxColumn() {
        return fxColumn;
    }

    public void setFxColumn(Integer fxColumn) {
        this.fxColumn = fxColumn;
    }

    public Integer getFyColumn() {
        return fyColumn;
    }

    public void setFyColumn(Integer fyColumn) {
        this.fyColumn = fyColumn;
    }

    public Integer getFzColumn() {
        return fzColumn;
    }

    public void setFzColumn(Integer fzColumn) {
        this.fzColumn = fzColumn;
    }

    public Integer getGaColumn() {
        return gaColumn;
    }

    public void setGaColumn(Integer gaColumn) {
        this.gaColumn = gaColumn;
    }

    public Integer getGbColumn() {
        return gbColumn;
    }

    public void setGbColumn(Integer gbColumn) {
        this.gbColumn = gbColumn;
    }

    public Integer getGcColumn() {
        return gcColumn;
    }

    public void setGcColumn(Integer gcColumn) {
        this.gcColumn = gcColumn;
    }

    public Integer getGdColumn() {
        return gdColumn;
    }

    public void setGdColumn(Integer gdColumn) {
        this.gdColumn = gdColumn;
    }

    public Integer getGeColumn() {
        return geColumn;
    }

    public void setGeColumn(Integer geColumn) {
        this.geColumn = geColumn;
    }

    public Integer getGfColumn() {
        return gfColumn;
    }

    public void setGfColumn(Integer gfColumn) {
        this.gfColumn = gfColumn;
    }

    public Integer getGgColumn() {
        return ggColumn;
    }

    public void setGgColumn(Integer ggColumn) {
        this.ggColumn = ggColumn;
    }

    public Integer getGhColumn() {
        return ghColumn;
    }

    public void setGhColumn(Integer ghColumn) {
        this.ghColumn = ghColumn;
    }

    public Integer getGiColumn() {
        return giColumn;
    }

    public void setGiColumn(Integer giColumn) {
        this.giColumn = giColumn;
    }

    public Integer getGjColumn() {
        return gjColumn;
    }

    public void setGjColumn(Integer gjColumn) {
        this.gjColumn = gjColumn;
    }

    public Integer getGkColumn() {
        return gkColumn;
    }

    public void setGkColumn(Integer gkColumn) {
        this.gkColumn = gkColumn;
    }

    public Integer getGlColumn() {
        return glColumn;
    }

    public void setGlColumn(Integer glColumn) {
        this.glColumn = glColumn;
    }

    public Integer getGmColumn() {
        return gmColumn;
    }

    public void setGmColumn(Integer gmColumn) {
        this.gmColumn = gmColumn;
    }

    public Integer getGnColumn() {
        return gnColumn;
    }

    public void setGnColumn(Integer gnColumn) {
        this.gnColumn = gnColumn;
    }

    public Integer getGoColumn() {
        return goColumn;
    }

    public void setGoColumn(Integer goColumn) {
        this.goColumn = goColumn;
    }

    public Integer getGpColumn() {
        return gpColumn;
    }

    public void setGpColumn(Integer gpColumn) {
        this.gpColumn = gpColumn;
    }

    public Integer getGqColumn() {
        return gqColumn;
    }

    public void setGqColumn(Integer gqColumn) {
        this.gqColumn = gqColumn;
    }

    public Integer getGrColumn() {
        return grColumn;
    }

    public void setGrColumn(Integer grColumn) {
        this.grColumn = grColumn;
    }

    public Integer getGsColumn() {
        return gsColumn;
    }

    public void setGsColumn(Integer gsColumn) {
        this.gsColumn = gsColumn;
    }

    public Integer getGtColumn() {
        return gtColumn;
    }

    public void setGtColumn(Integer gtColumn) {
        this.gtColumn = gtColumn;
    }

    public Integer getGuColumn() {
        return guColumn;
    }

    public void setGuColumn(Integer guColumn) {
        this.guColumn = guColumn;
    }

    public Integer getGvColumn() {
        return gvColumn;
    }

    public void setGvColumn(Integer gvColumn) {
        this.gvColumn = gvColumn;
    }

    public Integer getGwColumn() {
        return gwColumn;
    }

    public void setGwColumn(Integer gwColumn) {
        this.gwColumn = gwColumn;
    }

    public Integer getGxColumn() {
        return gxColumn;
    }

    public void setGxColumn(Integer gxColumn) {
        this.gxColumn = gxColumn;
    }

    public Integer getGyColumn() {
        return gyColumn;
    }

    public void setGyColumn(Integer gyColumn) {
        this.gyColumn = gyColumn;
    }

    public Integer getGzColumn() {
        return gzColumn;
    }

    public void setGzColumn(Integer gzColumn) {
        this.gzColumn = gzColumn;
    }

    public Integer getHaColumn() {
        return haColumn;
    }

    public void setHaColumn(Integer haColumn) {
        this.haColumn = haColumn;
    }

    public Integer getHbColumn() {
        return hbColumn;
    }

    public void setHbColumn(Integer hbColumn) {
        this.hbColumn = hbColumn;
    }

    public Integer getHcColumn() {
        return hcColumn;
    }

    public void setHcColumn(Integer hcColumn) {
        this.hcColumn = hcColumn;
    }

    public Integer getHdColumn() {
        return hdColumn;
    }

    public void setHdColumn(Integer hdColumn) {
        this.hdColumn = hdColumn;
    }

    public Integer getHeColumn() {
        return heColumn;
    }

    public void setHeColumn(Integer heColumn) {
        this.heColumn = heColumn;
    }

    public Integer getHfColumn() {
        return hfColumn;
    }

    public void setHfColumn(Integer hfColumn) {
        this.hfColumn = hfColumn;
    }

    public Integer getHgColumn() {
        return hgColumn;
    }

    public void setHgColumn(Integer hgColumn) {
        this.hgColumn = hgColumn;
    }

    public Integer getHhColumn() {
        return hhColumn;
    }

    public void setHhColumn(Integer hhColumn) {
        this.hhColumn = hhColumn;
    }

    public Integer getHiColumn() {
        return hiColumn;
    }

    public void setHiColumn(Integer hiColumn) {
        this.hiColumn = hiColumn;
    }

    public Integer getHjColumn() {
        return hjColumn;
    }

    public void setHjColumn(Integer hjColumn) {
        this.hjColumn = hjColumn;
    }

    public Integer getHkColumn() {
        return hkColumn;
    }

    public void setHkColumn(Integer hkColumn) {
        this.hkColumn = hkColumn;
    }

    public Integer getHlColumn() {
        return hlColumn;
    }

    public void setHlColumn(Integer hlColumn) {
        this.hlColumn = hlColumn;
    }

    public Integer getHmColumn() {
        return hmColumn;
    }

    public void setHmColumn(Integer hmColumn) {
        this.hmColumn = hmColumn;
    }

    public Integer getHnColumn() {
        return hnColumn;
    }

    public void setHnColumn(Integer hnColumn) {
        this.hnColumn = hnColumn;
    }

    public Integer getHoColumn() {
        return hoColumn;
    }

    public void setHoColumn(Integer hoColumn) {
        this.hoColumn = hoColumn;
    }

    public Integer getHpColumn() {
        return hpColumn;
    }

    public void setHpColumn(Integer hpColumn) {
        this.hpColumn = hpColumn;
    }

    public Integer getHqColumn() {
        return hqColumn;
    }

    public void setHqColumn(Integer hqColumn) {
        this.hqColumn = hqColumn;
    }

    public Integer getHrColumn() {
        return hrColumn;
    }

    public void setHrColumn(Integer hrColumn) {
        this.hrColumn = hrColumn;
    }

    public Integer getHsColumn() {
        return hsColumn;
    }

    public void setHsColumn(Integer hsColumn) {
        this.hsColumn = hsColumn;
    }

    public Integer getHtColumn() {
        return htColumn;
    }

    public void setHtColumn(Integer htColumn) {
        this.htColumn = htColumn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mastercsv)) {
            return false;
        }
        Mastercsv other = (Mastercsv) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.csus.csc191.models.Mastercsv[ id=" + id + " ]";
    }

    static {
        System.out.println(" -- Initializing Mastercsv.");
    }
}
