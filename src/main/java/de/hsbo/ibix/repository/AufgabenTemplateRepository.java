/*
 * AufgabenTemplateRepository.java 
 * 
 * Diese Datei ist Teil des Projekts IBIX.
 * 
 * Copyright 2023, Hochschule Bochum, Prof. Dr. Volker Klingspor, Prof. Dr. Christian Bockermann
 *  
 * Dieses Programm ist freie Software: Sie können es unter den Bedingungen der GNU General Public License,
 * wie von der Free Software Foundation, entweder Version 3 der Lizenz oder (nach Ihrer Wahl) jeder späteren
 * veröffentlichten Version, weitergeben und/oder modifizieren.
 *
 * Dieses Programm wird in der Hoffnung, dass es nützlich sein wird, aber OHNE JEDE GEWÄHRLEISTUNG, bereitgestellt.
 * Eine Kopie der GNU General Public License finden Sie in der Datei "LICENSE.md" oder unter
 * <https://www.gnu.org/licenses/>.
 * 
 * Das Projekt IBIX wurde durch die "Stiftung Innovation in der Hochschullehre" gefördert.
 */

package de.hsbo.ibix.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import de.hsbo.ibix.model.AufgabenTemplate;
import de.hsbo.ibix.model.DatenTemplate;

/**
 * The Interface AufgabenTemplateRepository.
 */
public interface AufgabenTemplateRepository extends JpaRepository<AufgabenTemplate, Integer> {
	public List<AufgabenTemplate> findAllByOrderById();
	public List<AufgabenTemplate> findAllByAufgabentypId(int i);
	public List<AufgabenTemplate> findAllByDatentemplate(DatenTemplate datentemplate);
	public List<AufgabenTemplate> findByNameContainingOrTagsContainingOrderById(String key1, String key2);
}