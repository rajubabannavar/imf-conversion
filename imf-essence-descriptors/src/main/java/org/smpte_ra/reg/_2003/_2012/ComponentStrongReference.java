//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 01:51:42 PM MSK 
//


package org.smpte_ra.reg._2003._2012;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.smpte_ra.reg._395._2014._13._1.aaf.CommentMarker;
import org.smpte_ra.reg._395._2014._13._1.aaf.DescriptiveClip;
import org.smpte_ra.reg._395._2014._13._1.aaf.DescriptiveMarker;
import org.smpte_ra.reg._395._2014._13._1.aaf.DynamicClip;
import org.smpte_ra.reg._395._2014._13._1.aaf.DynamicMarker;
import org.smpte_ra.reg._395._2014._13._1.aaf.EdgeCode;
import org.smpte_ra.reg._395._2014._13._1.aaf.EssenceGroup;
import org.smpte_ra.reg._395._2014._13._1.aaf.Filler;
import org.smpte_ra.reg._395._2014._13._1.aaf.GPITrigger;
import org.smpte_ra.reg._395._2014._13._1.aaf.HTMLClip;
import org.smpte_ra.reg._395._2014._13._1.aaf.NestedScope;
import org.smpte_ra.reg._395._2014._13._1.aaf.OperationGroup;
import org.smpte_ra.reg._395._2014._13._1.aaf.Pulldown;
import org.smpte_ra.reg._395._2014._13._1.aaf.ScopeReference;
import org.smpte_ra.reg._395._2014._13._1.aaf.Selector;
import org.smpte_ra.reg._395._2014._13._1.aaf.Sequence;
import org.smpte_ra.reg._395._2014._13._1.aaf.SourceClip;
import org.smpte_ra.reg._395._2014._13._1.aaf.Timecode;
import org.smpte_ra.reg._395._2014._13._1.aaf.TimecodeStream12M;
import org.smpte_ra.reg._395._2014._13._1.aaf.Transition;


/**
 * <p>Java class for ComponentStrongReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentStrongReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}TimecodeStream12M"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}Timecode"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}EssenceGroup"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}GPITrigger"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}CommentMarker"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}DescriptiveMarker"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}DynamicMarker"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}DynamicClip"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}EdgeCode"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}Filler"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}OperationGroup"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}ScopeReference"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}Selector"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}NestedScope"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}Pulldown"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}Sequence"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}SourceClip"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}DescriptiveClip"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}HTMLClip"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}Transition"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentStrongReference", propOrder = {
    "timecodeStream12M",
    "timecode",
    "essenceGroup",
    "gpiTrigger",
    "commentMarker",
    "descriptiveMarker",
    "dynamicMarker",
    "dynamicClip",
    "edgeCode",
    "filler",
    "operationGroup",
    "scopeReference",
    "selector",
    "nestedScope",
    "pulldown",
    "sequence",
    "sourceClip",
    "descriptiveClip",
    "htmlClip",
    "transition"
})
public class ComponentStrongReference {

    @XmlElement(name = "TimecodeStream12M", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected TimecodeStream12M timecodeStream12M;
    @XmlElement(name = "Timecode", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected Timecode timecode;
    @XmlElement(name = "EssenceGroup", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected EssenceGroup essenceGroup;
    @XmlElement(name = "GPITrigger", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected GPITrigger gpiTrigger;
    @XmlElement(name = "CommentMarker", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected CommentMarker commentMarker;
    @XmlElement(name = "DescriptiveMarker", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected DescriptiveMarker descriptiveMarker;
    @XmlElement(name = "DynamicMarker", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected DynamicMarker dynamicMarker;
    @XmlElement(name = "DynamicClip", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected DynamicClip dynamicClip;
    @XmlElement(name = "EdgeCode", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected EdgeCode edgeCode;
    @XmlElement(name = "Filler", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected Filler filler;
    @XmlElement(name = "OperationGroup", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected OperationGroup operationGroup;
    @XmlElement(name = "ScopeReference", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected ScopeReference scopeReference;
    @XmlElement(name = "Selector", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected Selector selector;
    @XmlElement(name = "NestedScope", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected NestedScope nestedScope;
    @XmlElement(name = "Pulldown", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected Pulldown pulldown;
    @XmlElement(name = "Sequence", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected Sequence sequence;
    @XmlElement(name = "SourceClip", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected SourceClip sourceClip;
    @XmlElement(name = "DescriptiveClip", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected DescriptiveClip descriptiveClip;
    @XmlElement(name = "HTMLClip", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected HTMLClip htmlClip;
    @XmlElement(name = "Transition", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected Transition transition;

    /**
     * Gets the value of the timecodeStream12M property.
     * 
     * @return
     *     possible object is
     *     {@link TimecodeStream12M }
     *     
     */
    public TimecodeStream12M getTimecodeStream12M() {
        return timecodeStream12M;
    }

    /**
     * Sets the value of the timecodeStream12M property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimecodeStream12M }
     *     
     */
    public void setTimecodeStream12M(TimecodeStream12M value) {
        this.timecodeStream12M = value;
    }

    /**
     * Gets the value of the timecode property.
     * 
     * @return
     *     possible object is
     *     {@link Timecode }
     *     
     */
    public Timecode getTimecode() {
        return timecode;
    }

    /**
     * Sets the value of the timecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timecode }
     *     
     */
    public void setTimecode(Timecode value) {
        this.timecode = value;
    }

    /**
     * Gets the value of the essenceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link EssenceGroup }
     *     
     */
    public EssenceGroup getEssenceGroup() {
        return essenceGroup;
    }

    /**
     * Sets the value of the essenceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link EssenceGroup }
     *     
     */
    public void setEssenceGroup(EssenceGroup value) {
        this.essenceGroup = value;
    }

    /**
     * Gets the value of the gpiTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link GPITrigger }
     *     
     */
    public GPITrigger getGPITrigger() {
        return gpiTrigger;
    }

    /**
     * Sets the value of the gpiTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPITrigger }
     *     
     */
    public void setGPITrigger(GPITrigger value) {
        this.gpiTrigger = value;
    }

    /**
     * Gets the value of the commentMarker property.
     * 
     * @return
     *     possible object is
     *     {@link CommentMarker }
     *     
     */
    public CommentMarker getCommentMarker() {
        return commentMarker;
    }

    /**
     * Sets the value of the commentMarker property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentMarker }
     *     
     */
    public void setCommentMarker(CommentMarker value) {
        this.commentMarker = value;
    }

    /**
     * Gets the value of the descriptiveMarker property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptiveMarker }
     *     
     */
    public DescriptiveMarker getDescriptiveMarker() {
        return descriptiveMarker;
    }

    /**
     * Sets the value of the descriptiveMarker property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptiveMarker }
     *     
     */
    public void setDescriptiveMarker(DescriptiveMarker value) {
        this.descriptiveMarker = value;
    }

    /**
     * Gets the value of the dynamicMarker property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicMarker }
     *     
     */
    public DynamicMarker getDynamicMarker() {
        return dynamicMarker;
    }

    /**
     * Sets the value of the dynamicMarker property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicMarker }
     *     
     */
    public void setDynamicMarker(DynamicMarker value) {
        this.dynamicMarker = value;
    }

    /**
     * Gets the value of the dynamicClip property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicClip }
     *     
     */
    public DynamicClip getDynamicClip() {
        return dynamicClip;
    }

    /**
     * Sets the value of the dynamicClip property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicClip }
     *     
     */
    public void setDynamicClip(DynamicClip value) {
        this.dynamicClip = value;
    }

    /**
     * Gets the value of the edgeCode property.
     * 
     * @return
     *     possible object is
     *     {@link EdgeCode }
     *     
     */
    public EdgeCode getEdgeCode() {
        return edgeCode;
    }

    /**
     * Sets the value of the edgeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdgeCode }
     *     
     */
    public void setEdgeCode(EdgeCode value) {
        this.edgeCode = value;
    }

    /**
     * Gets the value of the filler property.
     * 
     * @return
     *     possible object is
     *     {@link Filler }
     *     
     */
    public Filler getFiller() {
        return filler;
    }

    /**
     * Sets the value of the filler property.
     * 
     * @param value
     *     allowed object is
     *     {@link Filler }
     *     
     */
    public void setFiller(Filler value) {
        this.filler = value;
    }

    /**
     * Gets the value of the operationGroup property.
     * 
     * @return
     *     possible object is
     *     {@link OperationGroup }
     *     
     */
    public OperationGroup getOperationGroup() {
        return operationGroup;
    }

    /**
     * Sets the value of the operationGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationGroup }
     *     
     */
    public void setOperationGroup(OperationGroup value) {
        this.operationGroup = value;
    }

    /**
     * Gets the value of the scopeReference property.
     * 
     * @return
     *     possible object is
     *     {@link ScopeReference }
     *     
     */
    public ScopeReference getScopeReference() {
        return scopeReference;
    }

    /**
     * Sets the value of the scopeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeReference }
     *     
     */
    public void setScopeReference(ScopeReference value) {
        this.scopeReference = value;
    }

    /**
     * Gets the value of the selector property.
     * 
     * @return
     *     possible object is
     *     {@link Selector }
     *     
     */
    public Selector getSelector() {
        return selector;
    }

    /**
     * Sets the value of the selector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Selector }
     *     
     */
    public void setSelector(Selector value) {
        this.selector = value;
    }

    /**
     * Gets the value of the nestedScope property.
     * 
     * @return
     *     possible object is
     *     {@link NestedScope }
     *     
     */
    public NestedScope getNestedScope() {
        return nestedScope;
    }

    /**
     * Sets the value of the nestedScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link NestedScope }
     *     
     */
    public void setNestedScope(NestedScope value) {
        this.nestedScope = value;
    }

    /**
     * Gets the value of the pulldown property.
     * 
     * @return
     *     possible object is
     *     {@link Pulldown }
     *     
     */
    public Pulldown getPulldown() {
        return pulldown;
    }

    /**
     * Sets the value of the pulldown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pulldown }
     *     
     */
    public void setPulldown(Pulldown value) {
        this.pulldown = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Sequence }
     *     
     */
    public Sequence getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sequence }
     *     
     */
    public void setSequence(Sequence value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the sourceClip property.
     * 
     * @return
     *     possible object is
     *     {@link SourceClip }
     *     
     */
    public SourceClip getSourceClip() {
        return sourceClip;
    }

    /**
     * Sets the value of the sourceClip property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceClip }
     *     
     */
    public void setSourceClip(SourceClip value) {
        this.sourceClip = value;
    }

    /**
     * Gets the value of the descriptiveClip property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptiveClip }
     *     
     */
    public DescriptiveClip getDescriptiveClip() {
        return descriptiveClip;
    }

    /**
     * Sets the value of the descriptiveClip property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptiveClip }
     *     
     */
    public void setDescriptiveClip(DescriptiveClip value) {
        this.descriptiveClip = value;
    }

    /**
     * Gets the value of the htmlClip property.
     * 
     * @return
     *     possible object is
     *     {@link HTMLClip }
     *     
     */
    public HTMLClip getHTMLClip() {
        return htmlClip;
    }

    /**
     * Sets the value of the htmlClip property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTMLClip }
     *     
     */
    public void setHTMLClip(HTMLClip value) {
        this.htmlClip = value;
    }

    /**
     * Gets the value of the transition property.
     * 
     * @return
     *     possible object is
     *     {@link Transition }
     *     
     */
    public Transition getTransition() {
        return transition;
    }

    /**
     * Sets the value of the transition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transition }
     *     
     */
    public void setTransition(Transition value) {
        this.transition = value;
    }

}
