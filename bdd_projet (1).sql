-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Sam 26 Mars 2022 à 22:15
-- Version du serveur :  5.7.11
-- Version de PHP :  7.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `bdd_projet`
--

-- --------------------------------------------------------

--
-- Structure de la table `activite_compl`
--

CREATE TABLE `activite_compl` (
  `AC_NUM` int(11) NOT NULL,
  `AC_DATE` datetime NOT NULL,
  `AC_LIEU` char(25) NOT NULL,
  `AC_THEME` char(25) NOT NULL,
  `AC_MOTIF` char(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `activite_compl`
--

INSERT INTO `activite_compl` (`AC_NUM`, `AC_DATE`, `AC_LIEU`, `AC_THEME`, `AC_MOTIF`) VALUES
(1, '2021-09-01 09:00:00', 'sarcelles', 'cancérologie', 'formation'),
(2, '2021-12-08 14:30:00', 'soisy', 'cardiologie', 'formation'),
(3, '2022-07-07 13:30:00', 'Poitiers', 'hématologie', 'formation'),
(4, '2021-04-16 08:30:00', 'Poitiers', 'ophtalmologie', 'formation'),
(5, '2022-10-16 15:00:00', 'Paris', 'hématies', 'formation');

-- --------------------------------------------------------

--
-- Structure de la table `inviter`
--

CREATE TABLE `inviter` (
  `AC_NUMERO` int(11) NOT NULL,
  `PRA_NUMERO` smallint(6) NOT NULL,
  `SPECIALISTEON` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `inviter`
--

INSERT INTO `inviter` (`AC_NUMERO`, `PRA_NUMERO`, `SPECIALISTEON`) VALUES
(1, 5, 1),
(2, 7, 0),
(2, 10, 1),
(3, 2, 1),
(3, 4, 1),
(3, 5, 0),
(3, 6, 1),
(3, 11, 0),
(3, 12, 0),
(4, 2, 1),
(4, 5, 1),
(4, 8, 0),
(5, 3, 0),
(5, 5, 1),
(5, 9, 1);

-- --------------------------------------------------------

--
-- Structure de la table `posseder`
--

CREATE TABLE `posseder` (
  `PRA_NUM` smallint(6) NOT NULL,
  `codeSpe` int(5) NOT NULL,
  `POS_DIPLOME` char(40) NOT NULL,
  `POS_COEFPRESCRIPTION` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `posseder`
--

INSERT INTO `posseder` (`PRA_NUM`, `codeSpe`, `POS_DIPLOME`, `POS_COEFPRESCRIPTION`) VALUES
(2, 1, 'Doctorat', 3),
(2, 3, 'Licence pro Médecine', 3),
(3, 2, 'Diplôme d\'Etat Médecine', 5),
(3, 3, 'Licence pro Médecine', 5),
(4, 5, '	\r\nCertification professionnelle', 5),
(5, 1, 'Doctorat', 2),
(6, 1, 'Doctorat', 1),
(7, 2, 'Diplôme d\'Etat Médecine', 5),
(8, 2, 'Diplôme d\'Etat Médecine', 2),
(8, 3, 'Licence pro Médecine', 4),
(9, 1, 'Doctorat', 1),
(10, 1, 'Doctorat', 4),
(10, 3, 'Licence pro Médecine', 5),
(11, 4, 'Master médecine', 5),
(12, 3, 'Licence pro Médecine', 2);

-- --------------------------------------------------------

--
-- Structure de la table `praticien`
--

CREATE TABLE `praticien` (
  `PRA_NUM` smallint(6) NOT NULL,
  `PRA_NOM` char(25) NOT NULL,
  `PRA_PRENOM` char(30) NOT NULL,
  `PRA_ADRESSE` char(50) NOT NULL,
  `PRA_CP` char(5) NOT NULL,
  `PRA_VILLE` char(25) NOT NULL,
  `PRA_COEFNOTORIETE` double NOT NULL,
  `typeCode` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `praticien`
--

INSERT INTO `praticien` (`PRA_NUM`, `PRA_NOM`, `PRA_PRENOM`, `PRA_ADRESSE`, `PRA_CP`, `PRA_VILLE`, `PRA_COEFNOTORIETE`, `typeCode`) VALUES
(2, 'Dayan', 'Patrick', 'Rue Gabriel Péri', '95600', 'Eaubonne', 3.1, 1),
(3, 'Maury', 'Amar', 'Avenue de carnot', '94300', 'Vincennes', 3.9, 1),
(4, 'Dauvergne', 'Patrick', 'Rue des marechaux', '77920', 'fontainebleau', 5, 2),
(5, 'Fornol', 'Stephane', 'rue de bourgonne', '75016', 'paris', 4, 1),
(6, 'Bonnichon', 'Jean-Marc', 'Avenue marc Jaquet', '77000', 'Melun', 3.9, 2),
(7, 'Bellal', 'Sylvie', 'Boulevard Henry Valon', '91000', 'Evry', 4.2, 1),
(8, 'Brada', 'Elisabeth', 'Rue jean jaurés', '78190', 'Trappes', 4.1, 1),
(9, 'Gugenheim', 'Michel', 'rue d angivillier', '78120', 'Rambouillet', 3.4, 2),
(10, 'Renault', 'Francis', 'avenue jean laugerer', '95400', 'arnouville', 3.4, 1),
(11, 'vercati', 'helene', 'rue d istanbul', '94300', 'vincennes', 4.5, 2),
(12, 'Sitbon', 'Philipe', 'Rue carnot', '94270', 'Le Kremlin-Bicetre', 4, 4);

-- --------------------------------------------------------

--
-- Structure de la table `specialite`
--

CREATE TABLE `specialite` (
  `SPE_CODE` int(5) NOT NULL,
  `SPE_LIBELLE` char(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `specialite`
--

INSERT INTO `specialite` (`SPE_CODE`, `SPE_LIBELLE`) VALUES
(1, 'Cardiologie'),
(2, 'Gynecologie'),
(3, 'Chirurgie'),
(4, 'Pediatrie'),
(5, 'Neurologie'),
(6, 'Radiologie'),
(7, 'Endodontie'),
(8, 'Généraliste');

-- --------------------------------------------------------

--
-- Structure de la table `type_praticien`
--

CREATE TABLE `type_praticien` (
  `TYP_CODE` int(3) NOT NULL,
  `TYP_LIBELLE` char(25) NOT NULL,
  `TYP_LIEU` char(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `type_praticien`
--

INSERT INTO `type_praticien` (`TYP_CODE`, `TYP_LIBELLE`, `TYP_LIEU`) VALUES
(1, 'freelance', 'sarcelles'),
(2, 'assistant', 'paris'),
(3, 'cadre', 'soisy'),
(4, 'hospitalier', 'Strasbourg'),
(5, 'contractuels', 'blandy'),
(6, 'attachés', 'igney');

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

CREATE TABLE `users` (
  `idUser` int(11) NOT NULL,
  `nomUser` varchar(20) NOT NULL,
  `prenomUser` varchar(20) NOT NULL,
  `loginUser` varchar(20) NOT NULL,
  `pwdUser` varchar(20) NOT NULL,
  `statutUser` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `users`
--

INSERT INTO `users` (`idUser`, `nomUser`, `prenomUser`, `loginUser`, `pwdUser`, `statutUser`) VALUES
(1, 'Girard', 'Michel', 'mg', 'mg', 'admin'),
(2, 'Alison', 'Benjamin', 'ab', 'ab', 'user'),
(3, 'Gand', 'Lucile', 'gl', 'gl', 'user'),
(4, 'Frebaud', 'Alexandra', 'fa', 'fa', 'user');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `activite_compl`
--
ALTER TABLE `activite_compl`
  ADD PRIMARY KEY (`AC_NUM`);

--
-- Index pour la table `inviter`
--
ALTER TABLE `inviter`
  ADD PRIMARY KEY (`AC_NUMERO`,`PRA_NUMERO`),
  ADD KEY `PRA_NUMERO` (`PRA_NUMERO`);

--
-- Index pour la table `posseder`
--
ALTER TABLE `posseder`
  ADD PRIMARY KEY (`PRA_NUM`,`codeSpe`),
  ADD KEY `codeSpe` (`codeSpe`);

--
-- Index pour la table `praticien`
--
ALTER TABLE `praticien`
  ADD PRIMARY KEY (`PRA_NUM`,`typeCode`),
  ADD KEY `typeCode` (`typeCode`);

--
-- Index pour la table `specialite`
--
ALTER TABLE `specialite`
  ADD PRIMARY KEY (`SPE_CODE`);

--
-- Index pour la table `type_praticien`
--
ALTER TABLE `type_praticien`
  ADD PRIMARY KEY (`TYP_CODE`);

--
-- Index pour la table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`idUser`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `activite_compl`
--
ALTER TABLE `activite_compl`
  MODIFY `AC_NUM` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT pour la table `praticien`
--
ALTER TABLE `praticien`
  MODIFY `PRA_NUM` smallint(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT pour la table `specialite`
--
ALTER TABLE `specialite`
  MODIFY `SPE_CODE` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT pour la table `type_praticien`
--
ALTER TABLE `type_praticien`
  MODIFY `TYP_CODE` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT pour la table `users`
--
ALTER TABLE `users`
  MODIFY `idUser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `inviter`
--
ALTER TABLE `inviter`
  ADD CONSTRAINT `inviter_ibfk_1` FOREIGN KEY (`PRA_NUMERO`) REFERENCES `praticien` (`PRA_NUM`),
  ADD CONSTRAINT `inviter_ibfk_2` FOREIGN KEY (`AC_NUMERO`) REFERENCES `activite_compl` (`AC_NUM`);

--
-- Contraintes pour la table `posseder`
--
ALTER TABLE `posseder`
  ADD CONSTRAINT `posseder_ibfk_1` FOREIGN KEY (`codeSpe`) REFERENCES `specialite` (`SPE_CODE`),
  ADD CONSTRAINT `posseder_ibfk_2` FOREIGN KEY (`PRA_NUM`) REFERENCES `praticien` (`PRA_NUM`);

--
-- Contraintes pour la table `praticien`
--
ALTER TABLE `praticien`
  ADD CONSTRAINT `praticien_ibfk_1` FOREIGN KEY (`typeCode`) REFERENCES `type_praticien` (`TYP_CODE`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
