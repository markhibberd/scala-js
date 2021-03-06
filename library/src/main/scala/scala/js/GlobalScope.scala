/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2003-2013, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */



package scala.js

/** Marker trait for static modules representing the JS global scope
 *  When calling method on a top-level object or package object that is a
 *  subtype of GlobalScope, the receiver is dropped, and the JS global
 *  scope is used instead.
 */
trait GlobalScope extends Object
