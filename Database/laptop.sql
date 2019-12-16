-- phpMyAdmin SQL Dump
-- version 2.11.7
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 17, 2012 at 03:00 AM
-- Server version: 5.0.51
-- PHP Version: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `pemrograman-3`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY  (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('van', '123'),
('jay', '123');

-- --------------------------------------------------------

--
-- Table structure for table `produk`
--

CREATE TABLE IF NOT EXISTS `produk` (
  `kode` varchar(100) NOT NULL,
  `merk` varchar(100) NOT NULL,
  `type` varchar(100) NOT NULL,
  `harga` varchar(100) NOT NULL,
  PRIMARY KEY  (`kode`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `produk`
--

INSERT INTO `produk` (`kode`, `merk`, `type`, `harga`) VALUES
('001', 'Acer', '4736Z', 'Rp 5.000.000'),
('003', 'HP', '9090Z', 'Rp 4.500.000'),
('004', 'HP', '2343', 'Rp 5.000.000'),
('002', 'Acer', '4567Z', 'Rp 5.000.000');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE IF NOT EXISTS `transaksi` (
  `Kode` varchar(100) NOT NULL,
  `Merk` varchar(100) NOT NULL,
  `Status` varchar(100) NOT NULL,
  PRIMARY KEY  (`Kode`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`Kode`, `Merk`, `Status`) VALUES
('001', 'Toshiba', 'Terjual'),
('003', 'Acer', 'Belum Terjual'),
('002', 'Acer', 'Terjual');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `Id_user` varchar(100) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Jenis` varchar(50) NOT NULL,
  PRIMARY KEY  (`Id_user`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`Id_user`, `Nama`, `Email`, `Jenis`) VALUES
('rafii pratama', 'Muhammad Rafii', 'rafii@yahoo.com', 'Pria'),
('jaya', 'izay komrink', 'izay_tea@yahoo.com', 'pria'),
('Denny182', 'Denny Manusia Ikan', 'denny@yahoo.com', 'wanita'),
('Febry', 'Febry Damatraseta', 'febry@yahoo.com', 'Pria');
